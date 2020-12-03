package org.Java.spice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice {
    @Test
    public static void check(){
        System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
       Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
       driver.findElement(By.id("checkBoxOption1")).click();
       Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
    System.out.println( driver.findElement(By.id("checkBoxOption2")).isSelected());

    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    driver.close();


    }
}
