package class1;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {
    @BeforeClass
    public void beforeClass(){
        System.out.println(" I am before class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println(" I am after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am pre condition");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("I am post condition ");
    }
    @Test
    public void test(){
        System.out.println("I am actual test");
    }
    @Test
    public  void anotherTest(){
        System.out.println(" Iam another test");
    }
    @Test
    public void firstTest(){
        System.out.println(" I am a first test");
    }
}


