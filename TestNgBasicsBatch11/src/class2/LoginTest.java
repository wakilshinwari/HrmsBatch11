package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //we write a test case for log in page
    WebDriver driver;

    //precondition @before method  -- launch browser and navigate url
    @BeforeMethod
    public void openBrowserAndLaunchApplication(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    //@Test  --perform login
    //we use priority to chose each test should be performed based on our prioritazation
    @Test (priority = 2)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }
    //we create anohter @Test to execute gettitle
    @Test (priority = 1)
    public void validationOfTitle(){
        String actualTitle= driver.getTitle();
        String expectedTitle = "Human Management System";
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is faild");
        }
    }
    //post condition @aftere method    --- close browser
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
