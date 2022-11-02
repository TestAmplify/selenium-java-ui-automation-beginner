package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxElement {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();

        /* Locate Checkbox
        Page: dashboard
        Checkbox: Toys & Hobbies

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        WebElement toysAndHobbiesCheckBox = driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]"));

        /* Select/Check Checkbox
        Page: dashboard
        Checkbox: Toys & Hobbies

        Syntax:
        driver.findElement(locator).click();

         */
        driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]")).click();


        /* Check if checkbox is selected
        Page: dashboard
        Checkbox: Toys & Hobbies

        Syntax:
        driver.findElement(locator).isSelected();

         */
        System.out.println(driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]")).isSelected());


        /* Uncheck checkbox
        Page: dashboard
        Checkbox: Toys & Hobbies

        Syntax:
        driver.findElement(locator).click();

         */
        if (driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]")).isSelected())
        driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]")).click();

        // Uncheck the checkbox
        driver.findElement(By.xpath("//input[@id='purple-checkbox'  and contains(@value,'toys')]")).click();

    }
}
