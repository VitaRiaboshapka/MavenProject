package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.HiddenLayersPage;

public class TestsForHiddenLayersPage extends BaseTest {
    private HiddenLayersPage hiddenLayersPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/hiddenlayers");
        hiddenLayersPage = new HiddenLayersPage(driver);
    }
    @Test
    public void clickButton() {
        hiddenLayersPage.clickGreenButton();
        Boolean present = hiddenLayersPage.isNotPresent();
        Assert.assertEquals(present,present);

    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
