package window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WinClass {
  WebDriver driver;

  @BeforeTest
  public void method() {
    driver = new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  }

  @Test
  public void TestMethod() {
    driver.findElement(By.cssSelector("a[href*='windows']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
    Set<String> win = driver.getWindowHandles();
    Iterator<String> it = win.iterator();

    while(it.hasNext()) {
      String childId = it.next();
      driver.switchTo().window(childId);
      System.out.println(driver.getCurrentUrl());
    }



  }

  @AfterTest
  public void TearDown() {
    driver.close();
  }
}
