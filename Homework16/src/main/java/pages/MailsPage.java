package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class MailsPage extends BasePage {

    private SelenideElement createMessage = $("div.Left > p > a");

    public void goToMessageCreation() {
        $(this.createMessage).click();
    }

}