package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;

public class SectionsPage extends BasePage {

    private SelenideElement mailIcon = $("#newMail > a");

    public void goToMail() {
        $(this.mailIcon).click();
    }

}
