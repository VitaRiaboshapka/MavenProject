package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientSideDelayPage extends BasePage {

    public ClientSideDelayPage(WebDriver driver) {
        super(driver);
    }

    public By blueButton = By.id("ajaxButton");
    public By greenLabel = By.className("bg-success");

    public ClientSideDelayPage clickOnBlueButton() {
        driver.findElement(blueButton).click();
        return this;
    }

    public void clickOnGreenLabel() {
        Actions action = new Actions(driver);
        WebElement label = driver.findElement(greenLabel);
        action.doubleClick(label).perform();
    }

    public String getTextFromLabel() {
        return driver.findElement(greenLabel).getText();
    }
}
