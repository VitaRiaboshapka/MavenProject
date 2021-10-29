package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.VisibilityPage;

public class TestsForVisibilityPage extends BaseTest {
    private VisibilityPage visibilityPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/visibility");
        visibilityPage = new VisibilityPage(driver);
    }
    @Test
    public void checkVisibility() {
        visibilityPage.clickHideButton();
        Assert.assertFalse(visibilityPage.checkRemovedButton());
        Assert.assertTrue(visibilityPage.checkOverlappedButton());
        Assert.assertFalse(visibilityPage.checkTransparentButton());
        Assert.assertFalse(visibilityPage.checkVisibilityHiddenButton());
        Assert.assertFalse(visibilityPage.checkDisplayNoneButton());
        Assert.assertFalse(visibilityPage.checkOffScreenButton());
        Assert.assertFalse(visibilityPage.checkZeroWidth());
    }
    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}

