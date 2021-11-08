package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AJAXDataPage extends BasePage {

    public AJAXDataPage(WebDriver driver) {
        super(driver);
    }

    By ajaxButton = By.id("ajaxButton");
    By loadedLabel = By.className("bg-success");

    public AJAXDataPage clickAndWait() {
        driver.findElement(ajaxButton).click();
        return this;
    }

    public void clickOnLabelText() {
        driver.findElement(loadedLabel).click();
    }

    public String getTextFromLabel() {
        return driver.findElement(loadedLabel).getText();
    }
}
