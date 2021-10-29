package tests_automation_playground;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.MouseOverPage;

public class TestsForMouseOverPage extends BaseTest {
    private MouseOverPage mouseOverPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/mouseover");
        mouseOverPage = new MouseOverPage(driver);
    }

    @Test
        public void numberChanges() {
         mouseOverPage.clickOnButtonTwoTimes();
         mouseOverPage.clickOnButtonTwoTimes();
         String newNumber = mouseOverPage.numberChanges();
            Assert.assertEquals(newNumber, "2");
        }
    @AfterTest
    public void tearDown() {
        super.tearDown();
    }


    }

