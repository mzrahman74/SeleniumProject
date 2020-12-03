package org.Java.spice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Radio_button {

  WebDriver driver;

  @BeforeTest
  void launchTheApplication() {
    driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test (priority = 1)
  void radioButton() {

    List<WebElement> element = driver.findElements(By.name("radioButton"));
    element.isEmpty();
    System.out.println(element.size());
    driver.findElement(By.xpath("//input[@value='radio3']")).click();
  }

  @Test(priority = 2)
  void selectAll(){
      driver.findElement(By.xpath("//input[@value='radio2']")).click();
      driver.findElement(By.xpath("//input[@value='radio1']")).click();
  }

  @AfterTest
  void tearDown() {
    driver.close();
  }
}
