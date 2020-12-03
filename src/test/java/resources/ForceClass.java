package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForceClass {
    @Test
    public void Method(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
       String element = driver.findElement(By.cssSelector("div[id='error']")).getText();
       String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
    Assert.assertEquals(element, expected);
    driver.close();


    // Regular expression for expath //tagName[contains(@attribute,'Value')]-  xpath
        // tagName [Atrribute*='Value'] -- CSS regular exp


    }
}
