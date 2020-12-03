package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.mckesson.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    List<WebElement> element = driver.findElements(By.tagName("a"));
    // element.size();
    System.out.println(element.stream().collect(Collectors.toList()).size());
    element.stream().forEach(s -> System.out.println(s.getText()));

    /*for(WebElement link : element) {
    System.out.println(link.getText());
    }*/
    driver.close();
  }
}
