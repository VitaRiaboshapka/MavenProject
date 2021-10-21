package tests_automation_playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages_automation_playground.DynamicIdPage;

public class TestsForDynamicIdPage {
    public static ChromeDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/dynamicid");
    }

    @Test
    public static void clickButton() {
        DynamicIdPage searchObj = new DynamicIdPage(driver);
        searchObj.clickButton();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
