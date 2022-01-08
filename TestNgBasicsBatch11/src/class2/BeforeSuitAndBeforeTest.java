package class2;

import org.testng.annotations.*;

public class BeforeSuitAndBeforeTest {
    @BeforeSuite
    public void beforeSuite() {System.out.println("I am before suite");}

    @AfterSuite
    public void afterSuite() {System.out.println("I am after suite");}

    @BeforeTest
    public void beforeTest() {System.out.println("I am before test");}

    @AfterTest
    public void afterTest() {System.out.println("I am after test");}
        @BeforeClass
        public void beforeClass () { System.out.println(" I am before class");}

            @AfterClass
            public void afterClass () {System.out.println(" I am after class");}

            @BeforeMethod
            public void beforeMethod () {System.out.println("I am pre condition");}

            @AfterMethod
            public void afterMethod () { System.out.println("I am post condition ");}
            @Test
            public void normalTest () {System.out.println(" Iam common test");}
        }
