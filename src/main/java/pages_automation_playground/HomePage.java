package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By header = By.xpath("//h1");
    By clickButton = By.xpath("//a[@href='/click']");
    By inputTextButton = By.xpath("//a[@href='/textinput']");
    By loadDelayLink = By.linkText("Load Delay");
    By buttonClick = By.xpath("/html/body/section/div/button");


    public LoadDelays clickLink() {
        driver.findElement(loadDelayLink).click();
        return new LoadDelays(driver);
    }

    public void clickButton() {
        driver.findElement(buttonClick).click();
    }


    public String getHeader() {
        return driver.findElement(header).getText();
    }

    public ClickPage clickOnclickButton() {
        driver.findElement(clickButton).click();
        return new ClickPage(driver);
    }

    public InputTextPage clickOnInputTextButton() {
        inputTextButton.findElement(driver).click();
        return new InputTextPage(driver);
    }
}






