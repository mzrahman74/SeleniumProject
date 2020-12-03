package zyyah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class launch {
  WebDriver driver;

  @BeforeTest
  void VerifyLaunchTheApp() {
    driver = new FirefoxDriver();
    driver.get("");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test(priority = 1)
  void verifylogo() {
    WebElement element = driver.findElement(By.cssSelector("img#logo"));
    element.isDisplayed();
   // Assert.assertEquals(element.getText(), "ZYYAH");
    System.out.println(driver.getCurrentUrl());
  }

  @Test(priority = 2)
  void verifyFooterlinks() {
    System.out.println(driver.getPageSource());
    System.out.println(driver.findElements(By.tagName("a")).size());
  }

  @Test(priority = 3)
  void verifyTotalFooterLin() {
    WebElement footer = driver.findElement(By.xpath("//*[@id='et-boc']/div/div/div[8]/div[1]"));
    System.out.println(footer.findElements(By.tagName("a")).size());
  }

  @AfterTest
  void verifyTearDown() {
    driver.close();
  }
}
