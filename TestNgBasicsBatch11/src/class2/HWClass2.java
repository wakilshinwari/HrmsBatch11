package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HWClass2 {
    WebDriver driver ;

    @BeforeMethod
    public void verifyErrorMessage(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testIsDisplayed(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();
        String expectedTxt = "Password cannot be empty";
        String actualTxt=driver.findElement(By.cssSelector("span#spanMessage")).getText();
        Assert.assertEquals(actualTxt,expectedTxt);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
