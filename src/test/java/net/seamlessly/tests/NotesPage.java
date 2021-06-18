package net.seamlessly.tests;

import net.seamlessly.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NotesPage extends LoginPage {


    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='appmenu']/li[6]")).click();

    }

}
