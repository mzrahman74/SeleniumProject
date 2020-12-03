package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendar {
  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.path2usa.com/travel-companions");
    // April 14
      driver.findElement(By.xpath("//input[@name='travel_date']")).click();
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      while(!driver.findElement(By.cssSelector("class='datepicker-days'] [class='datepicker'-switch']")).getText().contains("April")) {
          driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
      }
     List<WebElement> dates = driver.findElements(By.className(("day")));
     // Grab common attribute nad put into list and Iterate
     int count = driver.findElements(By.className("day")).size();
     for (int i =0; i<count;i++) {
         String text = driver.findElements(By.className("day")).get(i).getText();
         if (text.equalsIgnoreCase("30")){
             driver.findElements(By.className("day")).get(i).click();
             break;
         }
     }
  }
}
