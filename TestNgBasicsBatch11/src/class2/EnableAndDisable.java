package class2;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test (enabled = true)
    public void firstTest(){
        System.out.println(" I am the first");
    }
    @Test(priority = 2, enabled = false)  //we can use both in the same parentheses
    public void secondTest(){
        System.out.println("I am the second");
    }
    @Test (enabled = true)
    public void thirdTest(){
        System.out.println(" I am the third");
    }
<<<<<<< HEAD

@Test(priority = 3, enabled = false)
public void testEnable(){
    System.out.println("Test");
}
}
=======
}
>>>>>>> origin/master
