package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class assignment {
  WebDriver driver;

  @BeforeTest
  public void launch() {
    driver = new FirefoxDriver();
    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void test() throws InterruptedException {
    WebElement el = driver.findElement(By.id("checkBoxOption3"));
    el.click();
    String opt = el.getText();
    Select dn = new Select(driver.findElement(By.id("dropdown-class-example")));
    dn.selectByVisibleText("Option3");
    WebElement l = driver.findElement(By.id("name"));
    l.sendKeys("Options3");
    driver.findElement(By.id("alertbtn")).click();
     String text = driver.switchTo().alert().getText();

    if(text.contains(opt)) {
      System.out.println("Alert message success");
    } else {
      System.out.println("Something wrong.");
    }

  }

  @AfterTest
  public void teardown() {
    driver.close();
  }
}
