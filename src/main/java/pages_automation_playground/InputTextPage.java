package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputTextPage {

    WebDriver driver;

    public InputTextPage(WebDriver driver) {
        this.driver = driver;
    }

    By inputTextField = By.className("form-control");
    By buttonUnderField = By.id("updatingButton");

    public void inputText(String text) {
        driver.findElement(inputTextField).sendKeys(text);
    }

    public String checkTextOfButtonBeforeClick() {
        return driver.findElement(buttonUnderField).getText();
    }

    public InputTextPage clickButtonUnderField() {
        driver.findElement(buttonUnderField).click();
        return this;
    }

    public String checkTextButtonAfterClick() {
        return driver.findElement(buttonUnderField).getText();
    }
}



