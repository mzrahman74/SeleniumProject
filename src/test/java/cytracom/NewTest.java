package cytracom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewTest {
    WebDriver driver;

    @BeforeTest
    void VerifyLaunchTheApp(){
        driver = new ChromeDriver();
        driver.get("https://www.cytracom.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void verifyLogo(){
       WebElement element = driver.findElement(By.cssSelector("img[class='logo_image'] "));
       element.isDisplayed();
       element.click();


    }
    @Test (priority = 2)
    void verifyFooterSuccessTeam(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement el = driver.findElement(By.xpath("//div[contains(text(),'Success Team')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", el);
        el.click();
        driver.findElement(By.xpath("//h1[text()='An Extension of Your Team']")).isDisplayed();

    }

    @AfterTest
    void verifyTeraDown(){
        driver.close();
    }
}
