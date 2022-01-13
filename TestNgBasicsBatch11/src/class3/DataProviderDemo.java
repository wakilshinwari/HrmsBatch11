package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo {
    WebDriver driver;

    @DataProvider
    public Object[][] data() {
        Object[][] login = new Object[4][2];
        login[0][0] = "Admin";
        login[0][1] = "Hum@nhrm123";
        login[1][0] = "Admin";
        login[1][1] = "Hum@nhrm123";
        login[2][0] = "Admin";
        login[2][1] = "Hum@nhrm123";
        login[3][0] = "Admin";
        login[3][1] = "Hum@nhrm123";
        return login;
    }

    //precondition @before method  -- launch browser and navigate url
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(groups = "regression", dataProvider = "data")
    public void adminLogin(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();

    }
}


