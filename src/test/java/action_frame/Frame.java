package action_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frame {

    @Test(priority = 4)
    public static void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        Actions c = new Actions(driver);
    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        c.dragAndDropBy(source,100, 100).perform();
        Thread.sleep(3000);
        c.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
        driver.close();

    }
}

