package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailsPage extends BasePage {

    @FindBy(css = "div.Left > p > a")
    private WebElement createMessage;

    public MailsPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void goToMessageCreation() {
        this.createMessage.click();
    }

}