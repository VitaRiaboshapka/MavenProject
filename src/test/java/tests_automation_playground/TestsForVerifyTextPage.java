package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.VerifyTextPage;

public class TestsForVerifyTextPage extends BaseTest {
    private  VerifyTextPage verifyTextPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/verifytext");
        verifyTextPage = new VerifyTextPage(driver);
    }
    @Test
    public void verifyText() {
       String text =  verifyTextPage.takeText();
        Assert.assertEquals(text,"Welcome UserName!");
    }
    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
}
