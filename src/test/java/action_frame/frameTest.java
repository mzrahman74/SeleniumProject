package action_frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class frameTest  {
    @Test(priority = 3)
    public static void able() throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver");
       WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println( driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));


        Actions b = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        b.dragAndDropBy(source,100,100).perform();
        Thread.sleep(3000);
        b.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent();
        driver.close();





    }
}
