package tests_automation_playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages_automation_playground.ProgressBarPage;

public class TestsForProgressBarPage extends BaseTest {

    private ProgressBarPage progressBarPage;

    @BeforeTest
    public void setUp() {
     //   super.setUp();
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl+"progressbar");
        progressBarPage = new ProgressBarPage(driver);
    }

    @Test
    public void clickWaitAndClick() {
        progressBarPage.progress();
        progressBarPage.clickGreenButton();
        String text = progressBarPage.getText();
        String newText = text.split(",")[0];
        Assert.assertEquals(newText, "Result: 0");
    }
}
