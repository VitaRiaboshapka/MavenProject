package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPage {
    WebDriver driver;

    public ClickPage(WebDriver driver) {
        this.driver = driver;
    }

    By buttonClickable = By.id("badButton");

    public String checkColorBeforeClick() {
        return driver.findElement(buttonClickable).getCssValue("background-color");
    }

    public ClickPage clickButtonWorks() {
        driver.findElement(buttonClickable).click();
        return this;
    }

    public String checkColorAfterClick() {
        return driver.findElement(buttonClickable).getCssValue("background-color");
    }
}
