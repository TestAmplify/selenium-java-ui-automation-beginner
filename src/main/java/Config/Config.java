package Config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class Config {

    private static final ThreadLocal<AllureSelenide> ALLURE_SELENIDE_LISTENER = ThreadLocal.withInitial(AllureSelenide::new);
    public static final String baseUrl = "http://test-amplify-vue.s3-website-us-east-1.amazonaws.com/";
    public static final String username = "";
    public static final String password = "";


    public static void suiteSetupForBrowser(String browser) {

        Configuration.browser = browser;
        Configuration.timeout = 30000;
        Configuration.headless = false;
        Configuration.browserSize = "1024x768";
        SelenideLogger.addListener("AllureSelenide", ALLURE_SELENIDE_LISTENER.get());
    }
}
