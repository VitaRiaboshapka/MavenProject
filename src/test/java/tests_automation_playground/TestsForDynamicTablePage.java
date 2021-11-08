package tests_automation_playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages_automation_playground.DynamicTablePage;

public class TestsForDynamicTablePage {

    public static ChromeDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/dynamictable");
    }

    @Test
    public static void compareCpu() {
        DynamicTablePage getCpuValue = new DynamicTablePage(driver);
        String fromTable = String.valueOf(getCpuValue.getValueFromTable());
        String fromField = String.valueOf(getCpuValue.getChromeCpu());
        Assert.assertEquals(fromTable, fromField);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

