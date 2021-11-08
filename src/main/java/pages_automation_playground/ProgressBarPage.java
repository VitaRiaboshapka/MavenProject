package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends BasePage {

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    By blueButton = By.id("startButton");
    By greenButton = By.id("stopButton");
    By resultField = By.xpath("//p[contains(text(),'Result:')]");

    public void clickGreenButton() {
        driver.findElement(greenButton).click();
    }

    public String getText() {
        return driver.findElement(resultField).getText();
    }

    public void progress() {
         driver.findElement(blueButton).click();
         WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
         Wait<WebDriver> wait = new WebDriverWait(driver, 40);
         wait.until(ExpectedConditions.textToBePresentInElement(progressBar,"75%"));
    }
}

