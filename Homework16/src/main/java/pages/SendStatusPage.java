package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;

public class SendStatusPage extends BasePage {

    private SelenideElement incomeLetters = $("ul > li.new > a");

    public void goToIncomeMail() {
        $(this.incomeLetters).click();
    }

}
