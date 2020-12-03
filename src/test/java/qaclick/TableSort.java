package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableSort {
  @Test
  public static void sort() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
   driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
   driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
    List<WebElement> li = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
    // xpath: //tr/td[2]
    ArrayList<String> original = new ArrayList<>();
    for (int i = 0; i < li.size(); i++) {
      original.add(li.get(i).getText());
    }
    ArrayList<String> copiesList = new ArrayList<>();
    for (int i = 0; i < original.size(); i++) {
      copiesList.add(original.get(i));
    }
    System.out.println("******************");
   // Collections.sort(copiesList); // asc
    Collections.reverse(copiesList); // descending
    for (String s : copiesList) // for (int i=0; i<copiesList.size();i++)
    {
      System.out.println(s);
    }

      System.out.println("********Original**********");
      Collections.sort(copiesList);
      for (String s : original) // for (int i=0; i<copiesList.size();i++)
      {
          System.out.println(s);
      }
    Assert.assertTrue(original.equals(copiesList));
  }
}
