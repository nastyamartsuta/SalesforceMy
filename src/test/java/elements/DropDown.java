package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String locatorAccount = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//a";
    String optionLocatorAccount = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]" +
            "//a[@title='%s']";
    String locatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/ancestor::div[contains(@class, 'slds-form-element__row')]//input";
    String optionLocatorContact = "//*[contains(@role,'option')]//span[@title='%s']";
    String searchContact = "//*[contains(@class,'isModal')]//label[text()='%s']" +
            "/ancestor::slot[contains(@slot, 'inputField')]//input";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectAccount(String option) {
        driver.findElement(By.xpath(String.format(locatorAccount, label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorAccount, option))).click();
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
