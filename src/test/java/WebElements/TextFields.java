package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextFields {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) throws InterruptedException {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();

        /* Locating Text Field
        Page: login
        TextField: username
        Syntax:
        WebElement element = driver.findElement(locator);
        */
        WebElement username = driver.findElement(By.xpath("//input[@type='email']"));


        /* Enter text in the text field
            Page: login
            TextField: username, password

            Syntax: driver.findElement(locator).sendKeys(text_to_send))
         */

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("username@username.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");

        Thread.sleep(5000);

        /* Clear text in the text field
            Page: login
            TextField: username

            Syntax: driver.findElement(locator).clear()
         */
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kumud@testamplify.com");
        driver.findElement(By.xpath("//input[@type='email']")).clear();


        /* Get text from the text field
            Page: login
            TextField: username

            Syntax: driver.findElement(locator).getAttribute(value))
         */

        String text = driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value");
        System.out.println(text);
        Thread.sleep(5000);

        // Assert text field Value

        String actualEmail = driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value");
        String expectedEmail = "kumud@testamplify.net";
        assert actualEmail == expectedEmail;


        
    }
}
