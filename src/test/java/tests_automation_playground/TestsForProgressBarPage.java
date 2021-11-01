package tests_automation_playground;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.ProgressBarPage;

public class TestsForProgressBarPage extends BaseTest {
    private ProgressBarPage progressBarPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/progressbar");
        progressBarPage = new ProgressBarPage(driver);
    }

    @Test
    public void clickWaitAndClick() throws Throwable {
            progressBarPage.progress();
            progressBarPage.clickGreenButton();
    }
}
