package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").writeAccount(account.getAccountName());
        new Input(driver, "Phone").writeAccount(account.getPhone());
        new Input(driver, "Website").writeAccount(account.getWebsite());
        new Input(driver, "Employees").writeAccount(account.getEmployees());
        new Input(driver, "Billing City").writeAccount(account.getBillingCity());
        new Input(driver, "Billing Zip/Postal Code").writeAccount(account.getBillingZipPostalCode());
        new Input(driver, "Billing State/Province").writeAccount(account.getBillingStateProvince());
        new Input(driver, "Billing Country").writeAccount(account.getBillingCountry());
        new Input(driver, "Shipping City").writeAccount(account.getShippingCity());
        new Input(driver, "Shipping Zip/Postal Code").writeAccount(account.getShippingZipPostalCode());
        new Input(driver, "Shipping State/Province").writeAccount(account.getShippingStateProvince());
        new Input(driver, "Shipping Country").writeAccount(account.getShippingCountry());
        new DropDown(driver, "Type").selectAccount("Analyst");
        new DropDown(driver, "Industry").selectAccount("Banking");
        new TextArea(driver, "Description").writeAccount(account.getDescription());
        new TextArea(driver, "Billing Street").writeAccount(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").writeAccount(account.getShippingStreet());

        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
