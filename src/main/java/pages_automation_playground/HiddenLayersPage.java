package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenLayersPage extends BasePage{

    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }
    By greenButton = By.id("greenButton");

    public HiddenLayersPage clickGreenButton() {
        driver.findElement(greenButton).click();
        return this;
    }
    public Boolean isNotPresent() {
        return driver.findElement(greenButton).isDisplayed();
    }

}

