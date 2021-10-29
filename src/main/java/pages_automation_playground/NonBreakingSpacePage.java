package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NonBreakingSpacePage extends BasePage {
    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }
    By myButton = By.xpath("//button[starts-with(text(), \'My\') and substring(text(), 4)=\'Button\']");

    public void clickMyButton() {
        driver.findElement(myButton).click();
    }
    public String getText() {
      return driver.findElement(myButton).getText();
    }
}
