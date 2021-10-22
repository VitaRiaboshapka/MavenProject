package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.AJAXDataPage;
import java.util.concurrent.TimeUnit;

public class TestsForAJAXPage extends BaseTest {
    private AJAXDataPage ajaxDataPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/ajax");
        ajaxDataPage = new AJAXDataPage(driver);
    }
    @Test
    public void clickOnButtonTriggeringRequest() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        ajaxDataPage.clickAndWait();
        ajaxDataPage.clickOnLabelText();
        String text = ajaxDataPage.getTextFromLabel();
        System.out.println(text);
        Assert.assertEquals("Data loaded with AJAX get request.",text);
    }
    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
