package pages_automation_playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicTablePage {
    WebDriver driver;

    public DynamicTablePage(WebDriver driver) {
        this.driver = driver;
    }
    By dynamicTableCpu = By.xpath("//span[text()='Chrome']/following-sibling::span[contains(text(),'%')]");
    By chromeCpu = By.xpath("//p[contains(text(),'%')]");

    public DynamicTablePage getValueFromTable() {
        driver.findElement(dynamicTableCpu).getText();
        return this;
    }

    public DynamicTablePage getChromeCpu() {
        driver.findElement(chromeCpu).getText();
        return this;
    }




}
