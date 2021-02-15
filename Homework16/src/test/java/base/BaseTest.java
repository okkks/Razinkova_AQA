package base;

import helpers.PropertyHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {

        open((PropertyHelper.getInstance().getProperty("liveUrl")));

    }

    @AfterMethod
    public void tearDown() {
        clearBrowserCookies();
    }


}
