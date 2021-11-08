package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleAppPage extends BasePage {

    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.xpath("//input[@name='UserName']");
    By password = By.xpath("//input[@name='Password']");
    By submitButton = By.xpath("//*[@id='login']");
    By loginStatus = By.xpath("//*[@id='loginstatus']");

    public void sendUserName(String text) {
        driver.findElement(userName).sendKeys(text);
    }

    public void sendPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginButton() {
        driver.findElement(submitButton).click();
    }

    public String getLoginStatusText() {
        return driver.findElement(loginStatus).getText();
    }
}
