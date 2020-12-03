package Tom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

class New {


  public static void main(String[] args) {
    WebDriver driver;

    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    WebElement element = driver.findElement(By.id("gh-ac"));
    element.click();
    element.sendKeys("camera");
    driver.findElement(By.cssSelector("input[id='gh-btn']")).click();

    // nth camera name

    List<WebElement> Object = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
    for (WebElement camera : Object) {
      String text = camera.getText();

      System.out.println(text);
    }

    driver.close();
  }
}
