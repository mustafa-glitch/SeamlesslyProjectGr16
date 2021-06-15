package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebElement usernameInputBox = driver.findElement(By.cssSelector("#user"));
        WebElement passwordInputBox = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("#submit-form"));





}
