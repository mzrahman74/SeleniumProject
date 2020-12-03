

// launch ebay search for iphone with categories cellphones and accessories then search

// show result and list of items  with scroll
//show the 10nt item




package Ebay;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
  WebDriver driver;

  @BeforeTest
  public void Method1() {
    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
  }

  @Test (priority = 1)
  public void Method2() {
    WebElement element = driver.findElement(By.cssSelector("input[id='gh-ac']"));
    element.click();
    element.sendKeys("Iphone");

    WebElement option = driver.findElement(By.cssSelector("select[id='gh-cat']"));
    option.click();
    Select select = new Select(option);
    select.selectByVisibleText("Cell Phones & Accessories");
    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    String result = driver.findElement(By.xpath("//h1[contains(text(),'results for')]")).getText();
    System.out.println(result);
    System.out.println("(((((((((((((((((((((((((((((");
  }

  @Test(priority=2)
  public void Verify_nthProduct(){
      int nthProduct=5;
      String item = String.format("//div[@id='srp-river-results']/ul/li[%d]", nthProduct);
      String nthItem = driver.findElement(By.xpath(item)).getText();
    System.out.println(nthItem);
    System.out.println("********************************");
  }

  @Test (priority = 3)
  public void listOfProduct(){


    List<WebElement> phone = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
    for(WebElement output: phone) {
        int x = output.getLocation().x;
        int y = output.getLocation().y;
        scrollBy(x,y);
       String phoneList = output.getText();


      System.out.println(phoneList);
      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }


  }


  public void scrollBy(int x, int y){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String jsCommand = String.format("window.scrollBy(%d,%d)", x, y);
    js.executeScript(jsCommand);

  }



  @AfterTest
    public void TearDown(){
      driver.close();
  }
}
