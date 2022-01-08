package class2;

import org.testng.annotations.*;

public class BeforeSuitAndBeforeTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
}
