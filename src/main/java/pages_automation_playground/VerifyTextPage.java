package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyTextPage extends BasePage {

    public VerifyTextPage(WebDriver driver) {
        super(driver);
    }

    By elementWithText = By.xpath("//span[@class='badge-secondary']//following::span[3]");

    public String takeText() {
        return driver.findElement(elementWithText).getText();
    }
}
