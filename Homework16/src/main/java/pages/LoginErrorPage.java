package pages;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginErrorPage extends BasePage {

    private SelenideElement errorMessage = $("#lform_errCtrl");


    public String getErrorText() {

        return this.errorMessage.innerText();

    }

}