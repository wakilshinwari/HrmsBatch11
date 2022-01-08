package PracticeClass01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrePostConditions {
    //we put our pre and post conditions
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am precondition");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am post condition");
    }
    @Test
    public void test(){
        System.out.println("Ia m actual test");
    }
    @Test
    public void AnotherTest(){
        System.out.println(" I am antoher test");
    }
}
