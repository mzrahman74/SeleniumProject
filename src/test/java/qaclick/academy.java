package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class academy {
  WebDriver driver;

  @Test
  void VerifyPageLinks() throws InterruptedException {
    driver = new FirefoxDriver();
     driver.get("http://qaclickacademy.com/practice.php");
    System.out.println(driver.findElements(By.tagName("a")));
    WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
    System.out.println(footerdriver.findElements(By.tagName("a")).size());

    // Footer Coloumn
    WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
    System.out.println(coloumndriver.findElements(By.tagName("a")).size());

    for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
      String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
      coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
      Thread.sleep(3000);
    }
    Set<String> it = driver.getWindowHandles();
    Iterator<String> is = it.iterator();

    while (is.hasNext()) {
      driver.switchTo().window(is.next());
      System.out.println(driver.getTitle());
    }
    driver.quit();
  }
}
