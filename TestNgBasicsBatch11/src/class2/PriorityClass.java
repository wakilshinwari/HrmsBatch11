package class2;

import org.testng.annotations.Test;

public class PriorityClass {
    @Test (priority = 2)
    public void fistTest() {
        System.out.println(" I am first1");
    }

    @Test (priority = 1)
    public void secondTest() {
        System.out.println(" I am first2");
    }

    @Test (priority = 3)
    public void thirdTest() {
        System.out.println(" I am first3");
    }
}