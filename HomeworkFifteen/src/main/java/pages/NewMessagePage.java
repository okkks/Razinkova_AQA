package pages;

import base.BasePage;
import helpers.PropertyHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMessagePage extends BasePage {

    @FindBy(css = "#to")
    private WebElement to;
    @FindBy(css = "span input[type=\"text\"]")
    private WebElement subject;
    @FindBy(css = "#text")
    private WebElement letterBody;
    @FindBy(css = "p input[name=\"send\"]")
    private WebElement submitLetterForm;
    @FindBy(css = "li.new > a")
    private WebElement incomeLetters;
    @FindBy(css = "#mesgList > form > div:nth-child(20) > a > span.frm")
    private WebElement senderName;

    public NewMessagePage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void sendEmail(){

        this.to.sendKeys(PropertyHelper.getInstance().getProperty("login"));
        this.subject.sendKeys("subject");
        this.letterBody.sendKeys("body");
        this.submitLetterForm.click();
        driver.navigate().refresh();
       // Assert.assertTrue(senderName.getText().contains(PropertyHelper.getInstance().getProperty("userName")));

    }

}