package WebElements;


// import alert class
import org.openqa.selenium.Alert;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class AlertElement {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) throws InterruptedException {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();

        /* Switch Alert */
        Alert alert = driver.switchTo().alert();

        /* Accept Alert

        Switch Alert First:
        Alert alert = driver.switchTo().alert();

         */
        alert.accept();

        /* Dismiss Alert

        Switch Alert First:
        Alert alert = driver.switchTo().alert();

        */
        alert.dismiss();

         /* Send Text in Alert

        Switch Alert First:
        Alert alert = driver.switchTo().alert();

        */
        alert.sendKeys("Test");









    }
}
