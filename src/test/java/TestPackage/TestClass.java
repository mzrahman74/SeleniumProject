package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
  WebDriver driver;

  @BeforeTest
  public void launch() {

    driver = new ChromeDriver();
    driver.get("https://www.mckesson.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test(priority = 1)
  public void method1() {
    List<WebElement> element = driver.findElements(By.tagName("a"));
   // int count = element.size();
   System.out.println("Total number of links: " +   element.stream().count());

      for(WebElement link: element){
        System.out.println(link);

        // printout give all the link out put

      }

        }







  @AfterTest
  public void tearDown() {
    driver.close();
  }
}

/// links -- webpage -- mckesson - get text  | click links
