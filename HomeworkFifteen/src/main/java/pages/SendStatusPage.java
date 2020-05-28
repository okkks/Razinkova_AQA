package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendStatusPage extends BasePage {

    @FindBy(css = "li.new > a")
    private WebElement incomeLetters;

    public SendStatusPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void goToIncomeMail() {
        this.incomeLetters.click();
    }

}
