package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.ClientSideDelayPage;
import java.util.concurrent.TimeUnit;

public class TestsForClientSideDelayPage extends BaseTest {

    private ClientSideDelayPage clientSideDelayPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get(baseUrl+"clientdelay");
        clientSideDelayPage = new ClientSideDelayPage(driver);
    }

    @Test
    public void clickOnButtonAndLabel() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        clientSideDelayPage.clickOnBlueButton();
        clientSideDelayPage.clickOnGreenLabel();
        String text = clientSideDelayPage.getTextFromLabel();
        Assert.assertEquals("Data calculated on the client side.", text);
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
