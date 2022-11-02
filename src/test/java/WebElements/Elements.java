package WebElements;

import Config.Config;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.*;

public class Elements {
    public static void setupBrowser(String browser) {
        Config.suiteSetupForBrowser(browser);
        Selenide.open(Config.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    public static void main(String[] args) {
        setupBrowser("chrome");
        WebDriver driver = WebDriverRunner.getWebDriver();


        /* Testing Element
        Page: login
        Text Label: Testing hub heading
        Text Field: username
        Link: Signup
        Button: Sign in

        */


        /* ---------------------------------------------------------------- */
        /* Locate Element

        Page: Login
        Web Element: Text Label

        Syntax:
        WebElement element = driver.findElement(locator);

         */
        WebElement labelTestingHub = driver.findElement(By.xpath("//h1"));
        WebElement linkSignUp = driver.findElement(By.linkText("Sign up"));

        /* ---------------------------------------------------------------- */
        /* Click Element

        Page: Login
        Web Element: Signup Link

        driver.findElement(locator).click();

        */
        driver.findElement(By.linkText("Sign up")).click();


        /* ---------------------------------------------------------------- */
        /* Check Visibility of Element
        Page: login
        Web Element: Username Text Field

        Syntax:
        driver.findElement(locator).isDisplayed();
         */

        driver.findElement(By.xpath("")).isDisplayed();


        /* ---------------------------------------------------------------- */
        /* Check Enable/Disable status for Element
        Page: login
        Web Element: Sign In Text Field

        Syntax:
        driver.findElement(locator).isEnabled();
         */
        boolean isEnabled  = driver.findElement(By.xpath("")).isEnabled();
        System.out.println(isEnabled); // 'true' if enabled; 'false' if disabled

        /* ---------------------------------------------------------------- */
        /* Get Location of Element
        Page: login
        Web Element: View Password Icon

        Syntax:
        driver.findElement(locator).getLocation();
         */

        Point point = driver.findElement(By.xpath("")).getLocation();
        System.out.println("View Password Icon is located at: "+point);


        /* ---------------------------------------------------------------- */
        /* Get Size of Element
        Page: login
        Web Element: View Password Icon

        Syntax:
        driver.findElement(locator).getLocation();
         */
        Dimension size = driver.findElement(By.xpath("")).getSize();
        System.out.println("Size of view password icon is: "+size);


         /* Get CSS Value
        Page: login
        Button: Sign In Button

        CSS Value for:
        1. font-size
        2. font-weight
        3. color


        Syntax:
        driver.findElement(locator).getLocation();

         */

        String fontSize = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("font-size");
        String fontWeight = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("font-weight");
        String color = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("color");

        System.out.println("Font Size is "+fontSize);
        System.out.println("Font Weight is "+ fontWeight);
        System.out.println("Color is "+ color);
    }
}
