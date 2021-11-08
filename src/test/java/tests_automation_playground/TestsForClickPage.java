package tests_automation_playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages_automation_playground.ClickPage;

public class TestsForClickPage {

    public static ChromeDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/click");
    }

    @Test
    public static void clickWorks() {
        ClickPage searchObj = new ClickPage(driver);
        String before = searchObj.checkColorBeforeClick();
        searchObj.clickButtonWorks();
        String after = searchObj.checkColorAfterClick();
        Assert.assertNotEquals(before, after);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
