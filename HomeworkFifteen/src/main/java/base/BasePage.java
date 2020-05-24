package base;

import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;


public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
}
