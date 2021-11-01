package tests_automation_playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages_automation_playground.HomePage;

import java.util.concurrent.TimeUnit;

public class TestsForHomePage {
    public static ChromeDriver driver;
    public String baseUrl = "http://www.uitestingplayground.com/";

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test(priority = 1)
     public void goToLoadDelay() {
        HomePage searchObj = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        searchObj.clickLink();
    }
    @Test(priority = 2)
    public void clickButtonAppearingAfterDelay() {
        HomePage searchObj = new HomePage(driver);
        searchObj.clickButton();
    }

    @Test
    public static void testHomePage() {
        HomePage searchObj = new HomePage(driver);
        Assert.assertEquals("UI Test Automation\n" + "Playground", searchObj.getHeader());
    }

    @Test
    public static void clickOnClick() {
        HomePage searchObj = new HomePage(driver);
        searchObj.clickOnclickButton();
    }

    @Test
    public static void clickOnInputText() {
        HomePage searchObj = new HomePage(driver);
        searchObj.clickOnInputTextButton();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

