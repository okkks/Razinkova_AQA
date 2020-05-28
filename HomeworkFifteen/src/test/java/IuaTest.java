import base.BaseTest;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.pool.TypePool;
import org.apache.log4j.BasicConfigurator;
import org.testng.Assert;
import pages.*;
import helpers.PropertyHelper;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class IuaTest extends BaseTest {

    @Test
    public void sendEmailTest(){

        HomePage homePage = new HomePage(driver);
        SectionsPage sectionPage = new SectionsPage(driver);
        MailsPage mailsPage = new MailsPage(driver);
        NewMessagePage newMessagePage = new NewMessagePage(driver);
        SendStatusPage sendStatusPage = new SendStatusPage(driver);
        IncomeLettersPage incomeLettersPage = new IncomeLettersPage(driver);

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

        HomePage homePage = new HomePage(driver);
        LoginErrorPage loginErrorPage = new LoginErrorPage(driver);

        homePage.loginError();
        Assert.assertTrue(loginErrorPage.getErrorText().contains("Неверный логин или пароль"));

    }

    @Test
    public void loginSuccessfulTest(){

        HomePage homePage = new HomePage(driver);
        homePage.loginSuccess();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Assert.assertTrue(homePage.getLogoutButtonText().contains("Выход"));

    }

}
