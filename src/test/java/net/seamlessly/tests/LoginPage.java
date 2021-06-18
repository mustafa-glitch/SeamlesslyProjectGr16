package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class LoginPage {

        WebDriver driver;
        @BeforeMethod
        public void setUp(){
                driver = WebDriverFactory.getDriver("chrome");
                driver.get("http://qa.seamlessly.net/");

                WebElement usernameInputBox = driver.findElement(By.cssSelector("#user"));
                usernameInputBox.sendKeys("Employee51");

                WebElement passwordInputBox = driver.findElement(By.cssSelector("#password"));
                passwordInputBox.sendKeys("Employee123");

                WebElement loginButton = driver.findElement(By.cssSelector("#submit-form"));
                loginButton.click();
        }
        @AfterMethod
        public void tearDown() throws InterruptedException {
                Thread.sleep(3000);
                driver.quit();
        }





}
