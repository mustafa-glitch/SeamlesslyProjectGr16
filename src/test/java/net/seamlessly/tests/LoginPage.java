package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
WebDriver driver = WebDriverFactory.getDriver("chrome");
    WebElement usernameInputBox = driver.findElement(By.cssSelector("#user"));
    WebElement passwordInputBox = driver.findElement(By.cssSelector("password"));


}
