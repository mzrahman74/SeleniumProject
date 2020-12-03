package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLess {
  @Test
  public void HeadLess() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("headless");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://rahulshettyacademy.com/#/index");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Mentorship")).click();
    System.out.println(driver.getCurrentUrl());
    driver.close();
  }
}