package window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
  public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("");
  }
}
