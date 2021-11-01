package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends BasePage {
    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    By blueButton = By.id("startButton");
    By greenButton = By.id("stopButton");
    By progressbar = By.xpath("//div[@role='progressbar']");

    public void clickBlueButton() {
        driver.findElement(blueButton).click();
    }

    public void clickGreenButton() {
        driver.findElement(greenButton).click();
    }

    public void progress() throws Throwable {
        driver.findElement(blueButton).click();
        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
        Wait<WebDriver> wait = new WebDriverWait(driver, 15);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return progressBar.getText().equals("75%");
            }
        });

    }
}
