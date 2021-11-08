package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenLayersPage extends BasePage {

    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    By greenButton = By.xpath("(//*[@type='button'])[2]");

    public HiddenLayersPage clickGreenButton() {
        driver.findElement(greenButton).click();
        return this;
    }

    public String getColorOfButton() {
       return driver.findElement(greenButton).getCssValue("background-color");
    }
}

