package Regexp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewClass {

    @Test
    public void method(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://rediff.com");
        driver.findElement(By.cssSelector("a[href*='login.cgi")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("mohammad");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[contains(@name,'proce')]")).click();
        driver.close();

    }
}
