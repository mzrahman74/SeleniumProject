package org.Java.spice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class heroku {
  @Test
  public static void window() throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "Browsers/geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
    Set<String> its = driver.getWindowHandles();
    Iterator<String> ip = its.iterator();
    String parentid = ip.next();
    String childid = ip.next();
    driver.switchTo().window((childid));
    System.out.println("After switching: ");
    System.out.println(
        driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
    driver.switchTo().window(parentid);
    System.out.println("After switchback");
    System.out.println(
        driver
            .findElement(By.xpath("//h3[contains(text(),'Opening a new window')]"))
            .getText());
    driver.quit();
  }
}
