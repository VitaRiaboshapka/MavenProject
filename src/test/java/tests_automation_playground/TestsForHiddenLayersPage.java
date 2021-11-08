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
        driver.get(baseUrl+"hiddenlayers");
        hiddenLayersPage = new HiddenLayersPage(driver);
    }

    @Test (priority = 1)
    public void clickButton() {
        String colorBefore = hiddenLayersPage.getColorOfButton();
        hiddenLayersPage.clickGreenButton();
        String colorAfter = hiddenLayersPage.getColorOfButton();
        Assert.assertEquals(colorAfter,colorBefore);
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
