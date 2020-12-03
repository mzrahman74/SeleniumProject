package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class camera {
  WebDriver driver;

  @BeforeTest
  public void launch() {
    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  @Test(priority = 1)
  public void method() {
    WebElement element = driver.findElement(By.id("gh-ac"));
    element.click();
    element.sendKeys("camera");
    driver.findElement(By.cssSelector("input[id='gh-btn']")).click();
    String result = driver.findElement(By.xpath("//h1[contains(text(),'results for')]")).getText();
    System.out.println(result);
    System.out.println("********************************");
  }

  @Test(priority = 2)
  public void getCameraNumber() {
    int productNumber = 10;
    String camera = String.format("//div[@id='srp-river-results']/ul/li[%d]", productNumber);
    String nthProduct = driver.findElement(By.xpath(camera)).getText();
    System.out.println(nthProduct);
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }

  @Test(priority = 3)
  public void getAllProducts() {
    List<WebElement> allProducts =
        driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
    Iterator<WebElement> products = allProducts.listIterator();
    Actions action = new Actions(driver);
    while (products.hasNext()) {
      WebElement output = products.next();
      action.moveToElement(output).build().perform();
      System.out.println(output.getText());
      System.out.println("---------------------------------");
    }
  }

  @AfterTest
  public void tearDown() {
    driver.close();
  }
}
