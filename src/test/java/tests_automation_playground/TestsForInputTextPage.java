package tests_automation_playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages_automation_playground.InputTextPage;

public class TestsForInputTextPage {

    public static ChromeDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/textinput");
    }

    @Test
    public static void textInput() {
        InputTextPage searchObj = new InputTextPage(driver);
        searchObj.inputText("Submit");
        String before = searchObj.checkTextOfButtonBeforeClick();
        searchObj.clickButtonUnderField();
        String after = searchObj.checkTextButtonAfterClick();
        Assert.assertNotEquals(before, after);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}


