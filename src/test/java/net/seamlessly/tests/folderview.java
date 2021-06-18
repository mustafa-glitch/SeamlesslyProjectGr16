package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class folderview {

    @Test
    public void test1() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa.seamlessly.net/index.php/login?clear=1");


        WebElement username = driver.findElement(By.id("user"));
        username.click();
        username.sendKeys("Employee111");


        WebElement password = driver.findElement(By.id("password"));
        password.click();

        password.sendKeys("Employee123");

        WebElement login = driver.findElement(By.id("submit-form"));
        login.click();

        WebElement folder = driver.findElement(By.className("app-icon"));
        folder.click();

    }

}
