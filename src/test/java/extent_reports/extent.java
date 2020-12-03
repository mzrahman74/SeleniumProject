package extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class extent {
    ExtentReports extent;


    @BeforeTest
    public void config(){

        // extent reports, extentsparkreporter
      String path =  System.getProperty("user.dir") + "/reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent= new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Mohammad Rahman");
    }

    @Test
    public void initialDemo(){
      ExtentTest test=  extent.createTest("initialDemo");
        System.setProperty("webdriver.chrome.driver","Browsers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");// Headless
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com");
    System.out.println(driver.getTitle());
    driver.close();
    //test.fail("Result do not match");
    extent.flush();
    }

}
