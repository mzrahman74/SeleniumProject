package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewTest {
  WebDriver driver;

  @BeforeTest
  public void Launch() {
    driver = new FirefoxDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  }

  @Test
  public void Test01() throws InterruptedException {
      WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
    Actions action = new Actions(driver);
    action
        .moveToElement(element)
        .build()
        .perform();
    action
        .moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
        .click()
        .keyDown(Keys.SHIFT)
        .sendKeys("Camera")
        .doubleClick()
        .build()
        .perform();
   action.moveToElement(element).contextClick().build().perform();
   Thread.sleep(2000);
  }

  @AfterTest
  public void tearDown() {
    driver.close();
  }
}
