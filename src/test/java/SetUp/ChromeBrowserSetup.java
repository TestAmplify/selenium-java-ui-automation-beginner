package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSetup {
    public static void main(String[] args) {

        // Step 1: Using Maven Project
        /*
        1. Install the necessary dependencies
            https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
        2. Set System Properties
            System.setProperty("webdriver.chrome.driver",chrome_driver_path);
         */

        String chrome_driver_path = "src/main/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver",chrome_driver_path);

        WebDriver driver = new ChromeDriver();
        driver.get("http://test-amplify-vue.s3-website-us-east-1.amazonaws.com/");

    }
}
