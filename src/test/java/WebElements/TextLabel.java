package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextLabel {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();


        /* Locate Text Label
        Page: login
        Text Label: Testing hub heading

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        WebElement labelTestingHub = driver.findElement(By.xpath("//h1"));

        /* Get Text from Text Label
        Page: login
        Text Label: Testing hub heading

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        String testingHubText = driver.findElement(By.xpath("//h1")).getText();
        System.out.println("Text for page heading is "+ testingHubText);


        /* Assert Text of Text Label
        Page: login
        Text Label: Testing hub heading

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        String headingTestingHub = driver.findElement(By.xpath("//h1")).getText();
        assert headingTestingHub == "Testing Hub";

    }
}