package tests_automation_playground;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_automation_playground.ClassAttrPage;

public class TestsForClassAttrPage extends BaseTest {
    private ClassAttrPage classAttrPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        driver.get("http://www.uitestingplayground.com/classattr");
        classAttrPage = new ClassAttrPage(driver);
    }
    @Test
    public void clickBlueButton() {
        classAttrPage.clickButton();
        driver.switchTo().alert().accept();

    }

    @AfterTest
    public void tearDown() {
     super.tearDown();
    }
}
