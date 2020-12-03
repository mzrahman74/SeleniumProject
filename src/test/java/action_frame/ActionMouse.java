package action_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class ActionMouse {
    @Test (priority = 1)
    public static void Mouse(){
     WebDriver driver = new FirefoxDriver();
    driver.get("https://www.amazon.com");
    driver.manage().window().maximize();
    Actions a = new Actions(driver);
    WebElement move= driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')] "));
    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    a.moveToElement(move).contextClick().build().perform(); // right click
    driver.close();

    }


    public static void Tim(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Actions b = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
        b.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        b.moveToElement(move).contextClick().build().perform();
        driver.close();

    }
}



