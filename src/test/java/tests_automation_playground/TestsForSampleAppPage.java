package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.SampleAppPage;

public class TestsForSampleAppPage extends BaseTest {

    private SampleAppPage sampleAppPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get(baseUrl+"sampleapp");
        sampleAppPage = new SampleAppPage(driver);
    }

    @Test
    public void performLogin() {
        sampleAppPage.sendUserName("Victoriia");
        sampleAppPage.sendPassword("pwd");
        sampleAppPage.clickLoginButton();
        String loginStatus = sampleAppPage.getLoginStatusText();
        Assert.assertEquals("Welcome, Victoriia!", loginStatus);
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
