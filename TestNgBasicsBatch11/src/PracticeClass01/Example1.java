package PracticeClass01;

import org.testng.annotations.Test;

public class Example1 {
    @Test
    //we write our method
    public void testNgTest() {
        System.out.println("I am first test");
        //we execute it without using Main mehtod
    }
    //TestNg executes codes based on alphabetical order
    @Test
    public void secondTest() {
        System.out.println(" I am second test");
    }

    @Test
    public void thirdTest() {
        System.out.println(" I am third test");
    }
}
