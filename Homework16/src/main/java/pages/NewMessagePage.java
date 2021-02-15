package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import helpers.PropertyHelper;

import static com.codeborne.selenide.Selenide.$;



public class NewMessagePage extends BasePage {

    private SelenideElement to = $("#to");
    private SelenideElement subject = $("span input[type=\"text\"]");
    private SelenideElement letterBody = $("#text");
    private SelenideElement submitLetterForm = $("p input[name=\"send\"]");

    public void sendEmail(){

        $(this.to).sendKeys(PropertyHelper.getInstance().getProperty("email"));
        $(this.subject).sendKeys("subject123456789");
        $(this.letterBody).sendKeys("body123456789");
        $(this.submitLetterForm).click();

    }

}