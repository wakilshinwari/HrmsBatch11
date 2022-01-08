package PracticeClass01;

import org.testng.annotations.*;

public class BeforeAndAfterClass {
    //before and after classs will be executed once as it is one class but methods will be printed based on the number of @Tests
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println(" I am after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @Test
    public void testNgTest() {
        System.out.println("I am first test");
    }

    @Test
    public void secondTest() {
        System.out.println(" I am second test");
    }

    @Test
    public void thirdTest() {
        System.out.println(" I am third test");
    }
}

