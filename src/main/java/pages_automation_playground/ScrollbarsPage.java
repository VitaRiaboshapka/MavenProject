package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollbarsPage extends BasePage {
    public ScrollbarsPage(WebDriver driver) {
        super(driver);
    }

    By blueButton = By.id("hidingButton");
    WebElement element1 = driver.findElement(By.id("hidingButton"));

    public void scrollTo() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element1);
    }
    public ScrollbarsPage clickButton() {
        driver.findElement(blueButton).click();
        return this;
    }
}
