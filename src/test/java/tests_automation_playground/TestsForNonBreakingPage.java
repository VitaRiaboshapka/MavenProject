package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.NonBreakingSpacePage;

public class TestsForNonBreakingPage extends BaseTest {
    private NonBreakingSpacePage nonBreakingSpacePage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/nbsp");
        nonBreakingSpacePage = new NonBreakingSpacePage(driver);
    }

    @Test
    public void clickButton() {
        nonBreakingSpacePage.clickMyButton();
        String text = nonBreakingSpacePage.getText();
        Assert.assertEquals(text,"My Button");
    }
    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
