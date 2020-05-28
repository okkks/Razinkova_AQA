package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeLettersPage extends BasePage {


    @FindBy(css = "div:nth-child(20) > a > span.frm")
    private WebElement senderName;

    public IncomeLettersPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public String getSenderName() {

        return this.senderName.getText();

    }

}