package TestPackage;

import freemarker.core.CSSOutputFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Amazon {
  WebDriver driver;

  @BeforeTest
  public void launch() {
    driver = new FirefoxDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
  }
  @Test(priority = 1)
  public void result(){
    WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
    element.click();
    element.sendKeys("kitchen knife set");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    String result = driver.findElement(By.xpath("//span[contains(text(),'1-48')]")).getText();
    System.out.println(result);
    System.out.println("******************************");
  }
  @Test(priority = 2)
  public void getNumber(){
    int knifeNumber = 10;
    String nthKnife = String.format("//div[contains(@class,'s-main-slot')])/div[%d]", knifeNumber);
    String knife = driver.findElement(By.cssSelector(nthKnife)).getText();
    System.out.println(knife);
    System.out.println("*******************************");
  }

  @Test (priority = 3)
  public void test01() {
    List<WebElement> list = driver.findElements(By.cssSelector("div[class*='s-main-slot'] div "));
   int items = list.stream().collect(Collectors.toList()).size();
    System.out.println(items);
    //list.stream().forEach(s-> System.out.println(s.getText()));
    }


  public void scrollBy(int x, int y) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String jsonCommand =String.format("window.scrollBy(%d,%d", x, y);
    js.executeScript(jsonCommand);
  }

  @AfterTest
  public void tearDown() {
    driver.close();
  }
}
