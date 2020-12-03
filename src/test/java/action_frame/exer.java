package action_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class exer {
  @Test(priority = 4)
  public static void exeFr() {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver
        .findElement(
            By.cssSelector("#content > ul:nth-child(4) > li:nth-child(34) > a:nth-child(1)"))
        .click();
    System.out.println(driver.findElements(By.tagName("frameset")).size());
    driver.switchTo().frame("frame-top");
    driver.switchTo().frame("frame-middle");
    System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
    driver.switchTo().defaultContent();
    driver.quit();
  }
}
