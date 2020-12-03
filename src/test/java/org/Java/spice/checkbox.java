package org.Java.spice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://spicejet.com");
    Thread.sleep(3000);
    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
    driver.findElement(By.id("MultiCityModelAlert")).click();
    Thread.sleep(3000);
    Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
    driver
        .findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_friendsandfamily']"))
        .click();
    System.out.println(driver
            .findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']"))
            .isSelected());


    // count of the number of checkbox
    driver.findElements(By.xpath("//input[@type='checkbox']")).size();

    driver.close();
  }
}
