package elements.lightning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LightningDropDown {
    WebDriver driver;
    String label;
//    String locatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
//            "/ancestor::div[contains(@class, 'slds-form-element__row')]//input";

    String locatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/ancestor::lightning-combobox//input";
    String optionLocatorContact = "//*[contains(@role,'option')]//span[@title='%s']";
    String searchContact = "//*[contains(@class,'isModal')]//label[text()='%s']" +
            "/ancestor::slot[contains(@slot, 'inputField')]//input";

    public LightningDropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectContact(String option) {
        driver.findElement(By.xpath(String.format(locatorContact, label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorContact, option))).click();
    }

    public void selectSearchContact(String option) {
        driver.findElement(By.xpath(String.format(searchContact, label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorContact, option))).click();
    }
}
