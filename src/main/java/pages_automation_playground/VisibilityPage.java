package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class VisibilityPage extends BasePage {

    public VisibilityPage(WebDriver driver) {
        super(driver);
    }

    By hideButton = By.id("hideButton");
    By removedButton = By.xpath("//*[@id=\"removedButton\"]");
    By overlappedButton = By.id("overlappedButton");
    By transparentButton = By.id("transparentButton");
    By visibilityHiddenButton = By.id("invisibleButton");
    By displayNoneButton = By.id("notdisplayedButton");
    By offScreenButton = By.id("offscreenButton");
    By zeroWidthButton = By.id("zeroWidthButton");

    public void clickHideButton() {
        driver.findElement(hideButton).click();
    }

    public Boolean checkRemovedButton() {
        List<WebElement> buttons = driver.findElements(removedButton);
        if (buttons.size() > 0 && buttons.get(0).isEnabled()) {
            return true;
        }
        return false;
    }

    public Boolean checkOverlappedButton() {
        List<WebElement> buttons = driver.findElements(overlappedButton);
        if (buttons.size() > 0 && buttons.get(0).isEnabled()) {
            return true;
        }
        return false;
    }

    public Boolean checkTransparentButton() {
        List<WebElement> buttons = driver.findElements(transparentButton);
        if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {
            return true;
        }
        return false;
    }

    public Boolean checkVisibilityHiddenButton() {
        List<WebElement> buttons = driver.findElements(visibilityHiddenButton);
        if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {
            return true;
        }
        return false;
    }

    public Boolean checkDisplayNoneButton() {
        List<WebElement> buttons = driver.findElements(displayNoneButton);
        if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {
            return true;
        }
        return false;
    }

    public Boolean checkOffScreenButton() {
        List<WebElement> buttons = driver.findElements(offScreenButton);
        if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {
            return true;
        }
        return false;
    }

    public Boolean checkZeroWidth() {
        List<WebElement> buttons = driver.findElements(zeroWidthButton);
        if (buttons.size() > 0 && buttons.get(0).isDisplayed()) {
            return true;
        }
        return false;
    }
}




