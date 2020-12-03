package org.Java.spice;

import Common.GlobalValuesDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class windows extends GlobalValuesDrive {

    @Test
    public static void child() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Thread.sleep(3000);
        Set<String>ids = driver.getWindowHandles();
        Iterator<String> it =ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
    System.out.println("After switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
    System.out.println("Switch back to parent");
        System.out.println(driver.getTitle());


    }
    @Test
    public static void tom(){
        driver.findElement(By.xpath("some")).click();
        driver.findElement(By.xpath("j")).click();
        Set<String> it = driver.getWindowHandles();
        Iterator<String> ie = it.iterator();
        String parent = ie.next();
        String child = ie.next();
        driver.switchTo().window(parent);
    System.out.println(driver.getTitle());
    }
}
