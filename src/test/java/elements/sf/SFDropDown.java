package elements.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SFDropDown {
    WebDriver driver;
    String label;
    String locatorAccount = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//a";
    String optionLocatorAccount = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]" +
            "//a[@title='%s']";

    public SFDropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectAccount(String option) {
        driver.findElement(By.xpath(String.format(locatorAccount, label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorAccount, option))).click();
    }
}
