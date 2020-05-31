package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import helpers.PropertyHelper;

import static com.codeborne.selenide.Selenide.$;


public class HomePage extends BasePage {

    private SelenideElement loginButton = $("div.clear > ul.user_menu > li.first > a");
    private SelenideElement loginInput = $("div.form form fieldset p input[name = \"login\"]");
    private SelenideElement passwordInput = $("div.form form fieldset p input[name = \"pass\"]");
    private SelenideElement submitLoginForm = $(".form input[type=\"submit\"]");
    private SelenideElement helloUserButton = $(" ul.user_menu > li.first > a");
    private SelenideElement logOutButton = $("li.right > a");

    public void loginSuccess(){

        $(this.loginButton).click();
        $(this.loginInput).sendKeys(PropertyHelper.getInstance().getProperty("login"));
        $(this.passwordInput).sendKeys(PropertyHelper.getInstance().getProperty("password"));
        $(this.submitLoginForm).click();

    }

    public void loginError() {

        $(this.loginButton).click();
        $(this.loginInput).sendKeys("oksana@iua.com");
        $(this.passwordInput).sendKeys("1234567shjQ");
        $(this.submitLoginForm).click();

    }

    public void transitionToSections() {

        loginSuccess();
        $(this.helloUserButton).click();

    }

    public String getLogoutButtonText() {

        return $(this.logOutButton).getText();

    }

}
