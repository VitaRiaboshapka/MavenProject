package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.By.xpath;

public class DynamicIdPage {

    WebDriver driver;

    public DynamicIdPage(WebDriver driver) {
        this.driver = driver;
    }

    By button = xpath("//*[@class='btn btn-primary']");

    public DynamicIdPage clickButton() {
        driver.findElement(button).click();
        return this;
    }
}
