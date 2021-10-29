package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseOverPage extends BasePage {

    public MouseOverPage(WebDriver driver) {
        super(driver);
    }

    By clickButton = By.linkText("Click me");
    By number = By.id("clickCount");

    public void clickOnButtonTwoTimes() {
      driver.findElement(clickButton).click();
    }

    public String numberChanges() {
        return driver.findElement(number).getText();
    }
}
