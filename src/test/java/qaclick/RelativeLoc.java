package qaclick;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLoc {
  WebDriver driver;

  @Test(priority = 1)
  void verifyRelativeLocator() throws IOException {
   driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));

    System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());

    WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
    driver.findElement(withTagName("input").below(dateofBirth)).sendKeys("07/05/1974");

    // Left locator

    WebElement lt =
        driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
    driver.findElement(withTagName("input").toLeftOf(lt)).click();

    // Right locator // screen shot sle

    WebElement rh = driver.findElement(By.xpath("//label[contains(text(),'Employment Status:')]"));
    driver.findElement(withTagName("input").toRightOf(rh)).click();

    driver.close();
  }

  @Test(priority = 2)
  void verifyMultiTask() throws IOException {
    driver = new FirefoxDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.switchTo().newWindow(WindowType.TAB);
    Set<String> st = driver.getWindowHandles();
    Iterator<String> it = st.iterator();
    String parentWindow = it.next();
    String childWindow = it.next();
    driver.switchTo().window(childWindow);
    driver.get("https://rahulshettyacademy.com");
    String courseName =
        driver
            .findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p'"))
            .get(1)
            .getText();
    driver.switchTo().window(parentWindow);
    // Screen shot
    WebElement name = driver.findElement(By.cssSelector("[name='name']"));
    name.sendKeys(courseName);
    File file = name.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("lok.png"));

    System.out.println(name.getRect().getDimension().getHeight());
    System.out.println(name.getRect().getDimension().getWidth());

  }

  @AfterTest
  public void teardown() {
    driver.quit();
  }
}
