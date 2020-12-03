package Wait.com;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class fluentWait {
  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    driver.findElement(By.cssSelector(" div[id='start'] button")).click();

      Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
              .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
      public WebElement apply(WebDriver driver)
      { if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
        return driver.findElement(By.cssSelector("div[id='finish'] h4"));
      } else  {
        return null;
      }
      }
    });
    System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
    driver.close();
  }
}
