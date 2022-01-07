package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
//    Task 1: Executing tests using @Test
//● Create three tests with unique @test methods names.
//● Execute all test methods
    @BeforeMethod
    public void task1(){
        System.out.println("This is task one");
    }
    @AfterMethod
    public void task2(){
        System.out.println("This is task two");
    }
    @Test
    public void play(){
        System.out.println(" I am playing voilin ");
    }
    @Test
    public void eat(){
        System.out.println("I am eating lunch ");
    }
    @Test
    public void click(){
        System.out.println(" Pleae click the first link");

    }
}
