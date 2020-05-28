package pages;

import base.BasePage;
import helpers.PropertyHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    @FindBy(css = "div.clear > ul.user_menu > li.first > a")
    private WebElement loginButton;
    @FindBy(css = "div.form form fieldset p input[name = \"login\"]")
    private WebElement loginInput;
    @FindBy(css = "div.form form fieldset p input[name = \"pass\"]")
    private WebElement passwordInput;
    @FindBy(css = ".form input[type=\"submit\"]")
    private WebElement submitLoginForm;
    @FindBy(css = " ul.user_menu > li.first > a")
    private WebElement helloUserButton;
    @FindBy(css = "li.right > a")
    private WebElement logOutButton;


    public HomePage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void loginSuccess(){

        this.loginButton.click();
        this.loginInput.sendKeys(PropertyHelper.getInstance().getProperty("login"));
        this.passwordInput.sendKeys(PropertyHelper.getInstance().getProperty("password"));
        this.submitLoginForm.click();

    }

    public void loginError() {

        this.loginButton.click();
        this.loginInput.sendKeys("oksana@iua.com");
        this.passwordInput.sendKeys("1234567shjQ");
        this.submitLoginForm.click();

    }

    public void transitionToSections() {

        loginSuccess();
        this.helloUserButton.click();

    }

    public String getLogoutButtonText() {

        return this.logOutButton.getText();

    }

}
