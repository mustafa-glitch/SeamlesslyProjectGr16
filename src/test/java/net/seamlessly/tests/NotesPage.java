package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotesPage {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    WebElement NotesModule = driver.findElement(By.xpath("//div[@id='apps']//li[contains(@data-id,'notes')]"));
    WebElement newNote = driver.findElement(By.cssSelector("#notes_new_note"));
}
