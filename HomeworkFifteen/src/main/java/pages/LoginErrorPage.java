package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginErrorPage extends BasePage {

    @FindBy(css = "#lform_errCtrl")
    private WebElement errorMessage;

    public LoginErrorPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public String getErrorText() {

        return this.errorMessage.getText();

    }

}