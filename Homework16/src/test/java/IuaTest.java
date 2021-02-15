import base.BaseTest;
import org.testng.Assert;
import pages.*;
import helpers.PropertyHelper;
import org.testng.annotations.Test;



public class IuaTest extends BaseTest {

    @Test
    public void sendEmailTest(){

        HomePage homePage = new HomePage();
        SectionsPage sectionPage = new SectionsPage();
        MailsPage mailsPage = new MailsPage();
        NewMessagePage newMessagePage = new NewMessagePage();
        SendStatusPage sendStatusPage = new SendStatusPage();
        IncomeLettersPage incomeLettersPage = new IncomeLettersPage();

        homePage.transitionToSections();
        sectionPage.goToMail();
        mailsPage.goToMessageCreation();
        newMessagePage.sendEmail();
        sendStatusPage.goToIncomeMail();
        Assert.assertTrue(incomeLettersPage.getSenderName()
                .contains(PropertyHelper.getInstance().getProperty("userName")));

    }

    @Test
    public void loginErrorTest(){

        HomePage homePage = new HomePage();
        LoginErrorPage loginErrorPage = new LoginErrorPage();

        homePage.loginError();
        Assert.assertTrue(loginErrorPage.getErrorText().contains("Неверный логин или пароль"));

    }

    @Test
    public void loginSuccessfulTest(){

        HomePage homePage = new HomePage();
        homePage.loginSuccess();

        Assert.assertTrue(homePage.getLogoutButtonText().contains("Выход"));

    }

}
