package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassAttrPage extends BasePage {

    public ClassAttrPage(WebDriver driver) {
        super(driver);
    }

    By blueButton = By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");

    public ClassAttrPage clickButton() {
        driver.findElement(blueButton).click();
        return this;
    }
}
