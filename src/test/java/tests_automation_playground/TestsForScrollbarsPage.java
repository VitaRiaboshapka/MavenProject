package tests_automation_playground;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.ScrollbarsPage;

public class TestsForScrollbarsPage extends BaseTest {
    private ScrollbarsPage scrollbarsPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/scrollbars");
        scrollbarsPage = new ScrollbarsPage(driver);
    }
    @Test
    public void clickOnHiddenButton() {
        scrollbarsPage.scrollTo();
        scrollbarsPage.clickButton();
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }
    }

