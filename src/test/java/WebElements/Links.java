package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();

        /* ---------------------------------------------------------------- */
        /* Locate Link

        Page: Login
        Link: Sign up

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        WebElement labelTestingHub = driver.findElement(By.linkText("Sign up"));

        /* ---------------------------------------------------------------- */
        /* Click Link

        Page: Login
        Link: Sign up

        Syntax:
        driver.findElement(locator).click();

         */
        driver.findElement(By.linkText("Sign up")).click();

        /* ---------------------------------------------------------------- */
        /* Check Link Visibility

        Page: Login
        Link: Sign up

        Syntax:
        driver.findElement(locator).isDisplayed();

         */
        driver.findElement(By.linkText("Sign up")).isDisplayed();


        /* ---------------------------------------------------------------- */
        /* Get Link Text

        Page: Login
        Link: Sign up

        Syntax:
        driver.findElement(locator).getText();

         */
        String linkText = driver.findElement(By.linkText("Sign up")).getText();
        System.out.println("Link text is: "+linkText);
    }
}
