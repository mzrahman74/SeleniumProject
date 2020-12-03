package greenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class greenCart {
  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    int j=0;

    // Brocolli - 1 kg
      //Brocolli, 1 kg
    String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
    for (int i = 0; i < products.size(); i++) {
      String[] name = products.get(i).getText().split("-");
      System.out.println(name);
      // convert array into array list
      // check whether name you extracted is present in arrayList or not
      String formatName = name[0].trim(); // remove space by trim
      List<String> list = Arrays.asList(itemsNeeded);

      if (list.contains(formatName)) {
          j++;
        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        if(j==3) {
            break;

        }

      }
      driver.close();
    }
  }
}
