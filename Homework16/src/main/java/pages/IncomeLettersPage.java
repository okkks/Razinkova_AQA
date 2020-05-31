package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class IncomeLettersPage extends BasePage {

    private SelenideElement senderName = $("div:nth-child(20) > a > span.frm");

    public String getSenderName() {

        return $(this.senderName).getText();

    }

}