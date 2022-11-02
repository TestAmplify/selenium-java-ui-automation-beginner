package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonElement {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();


        /* Locate Button
        Page: dashboard
        Button: Add to Cart

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));

        /* Click Button
        Page: dashboard
        Button: Add to Cart

        Syntax:
        driver.findElement(locator).click();

         */
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

        /* Check Button Visibility
        Page: dashboard
        Button: Add to Cart

        Syntax:
        driver.findElement(locator).isDisplayed();

         */
        driver.findElement(By.xpath("//button[text()='Add to cart']")).isDisplayed();

        /* Check Enable/Disable Status
        Page: dashboard
        Button: Add to Cart

        Syntax:
        driver.findElement(locator).isEnabled();

         */
        System.out.println(driver.findElement(By.xpath("//button[text()='Add to cart']")).isEnabled()); // 'true' if enabled, 'false' if disabled

        /* Get Location
        Page: dashboard
        Button: Add to Cart

        Syntax:
        driver.findElement(locator).getLocation();

         */
        Point location = driver.findElement(By.xpath("//button[text()='Add to cart']")).getLocation();
        System.out.println(location.toString());


        /* Get CSS Value
        Page: dashboard
        Button: Add to Cart

        CSS Value for:
        1. font-size
        2. font-weight
        3. color


        Syntax:
        driver.findElement(locator).getLocation();

         */

        String fontSize = driver.findElement(By.xpath("//button[text()='Add to cart']")).getCssValue("font-size");
        String fontWeight = driver.findElement(By.xpath("//button[text()='Add to cart']")).getCssValue("font-weight");
        String color = driver.findElement(By.xpath("//button[text()='Add to cart']")).getCssValue("color");

        System.out.println("Font Size is "+fontSize);
        System.out.println("Font Weight is "+ fontWeight);
        System.out.println("Color is "+ color);






    }
}
