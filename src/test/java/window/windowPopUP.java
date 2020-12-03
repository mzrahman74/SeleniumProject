package window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class windowPopUP {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
    WebDriver driver = new ChromeDriver();
    String message = "Congratulations! You must have the proper credentials.";
    // https://the-internet.herokuapp.com/
    driver.get("http://admin:admin@the-internet.herokuapp.com/");
    driver.findElement(By.linkText("Basic Auth")).click();
    WebElement msg = driver.findElement(By.xpath("//*[@id='content']/div/p"));
    msg.isDisplayed();
    //Assert.assertEquals(msg, message);
    driver.close();


  }
}
