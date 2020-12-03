package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test
    public void playload(){
    System.out.println("Second class test.");
    }

    @BeforeTest
    public void beforeTest(){
    System.out.println("Before Test.");
    }

}
