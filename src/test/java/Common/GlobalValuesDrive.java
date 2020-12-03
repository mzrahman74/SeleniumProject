package Common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class GlobalValuesDrive {
  public static WebDriver driver;

  @BeforeTest
  @Parameters({"browser", "url"})

  public static void launch(String browser, String HOST) throws IOException {
    Properties prop = new Properties();
      FileInputStream fis = new FileInputStream("/Users/mohammadrahman/SeleniumProject/src/test/java/Common/data.properties");
      prop.load(fis);
      prop.get("url");
    //System.out.println(prop.getProperty("browser"));
    //System.out.println(prop.getProperty("url"));
    FileOutputStream fos = new FileOutputStream("/Users/mohammadrahman/SeleniumProject/src/test/java/Common/data.properties");
    prop.store(fos, null);
    prop.setProperty("browser", "firefox");
    if (browser.equals("safari")) {
      driver = new SafariDriver();
      Reporter.log("Script execting on" + browser + "Browser", true);

    } else if (browser.equals("chrome")) {
      System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver");
      driver = new ChromeDriver();
      Reporter.log("Script execting on" + browser + "Browser", true);

    } else {
      driver = new FirefoxDriver();
      Reporter.log("Script execting on " + browser + "Browser", true);
    }
   // System.out.println(prop.getProperty("browser"));
    driver.get(prop.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();

  }

  @AfterTest
  public static void close(){
    driver.quit();
  }
}
