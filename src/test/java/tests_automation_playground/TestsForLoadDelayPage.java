package tests_automation_playground;

import org.testng.annotations.BeforeTest;
import pages_automation_playground.LoadDelays;

public class TestsForLoadDelayPage extends BaseTest {

    private LoadDelays loadDelays;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/");
        loadDelays = new LoadDelays(driver);
    }
}

