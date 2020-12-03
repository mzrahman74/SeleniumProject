package org.Java.spice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class Css {
  @Test
  public void fly() {
     System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
     WebDriver driver = new ChromeDriver();
    //WebDriver driver = new SafariDriver();
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    driver.get("http://www.spicejet.com/");
    driver.manage().window().maximize();
    WebElement source = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
    source.clear();
    source.sendKeys("MUM");
    source.sendKeys(Keys.ENTER);
    WebElement destination =
    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
    destination.clear();
    destination.sendKeys("AHM");
    destination.sendKeys(Keys.ENTER);
    driver.close();
    }

      }

