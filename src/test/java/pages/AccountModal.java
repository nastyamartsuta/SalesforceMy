package pages;

import elements.sf.SFDropDown;
import elements.sf.SFInput;
import elements.sf.SFTextArea;
import io.qameta.allure.Step;
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

    @Step("Fill in form for new account")
    public AccountDetailsPage create(Account account) {
        new SFInput(driver, "Account Name").writeAccount(account.getAccountName());
        new SFInput(driver, "Phone").writeAccount(account.getPhone());
        new SFInput(driver, "Website").writeAccount(account.getWebsite());
        new SFInput(driver, "Employees").writeAccount(account.getEmployees());
        new SFInput(driver, "Billing City").writeAccount(account.getBillingCity());
        new SFInput(driver, "Billing Zip/Postal Code").writeAccount(account.getBillingZipPostalCode());
        new SFInput(driver, "Billing State/Province").writeAccount(account.getBillingStateProvince());
        new SFInput(driver, "Billing Country").writeAccount(account.getBillingCountry());
        new SFInput(driver, "Shipping City").writeAccount(account.getShippingCity());
        new SFInput(driver, "Shipping Zip/Postal Code").writeAccount(account.getShippingZipPostalCode());
        new SFInput(driver, "Shipping State/Province").writeAccount(account.getShippingStateProvince());
        new SFInput(driver, "Shipping Country").writeAccount(account.getShippingCountry());
        new SFDropDown(driver, "Type").selectAccount(account.getType());
        new SFDropDown(driver, "Industry").selectAccount(account.getIndustry());
        new SFTextArea(driver, "Description").writeAccount(account.getDescription());
        new SFTextArea(driver, "Billing Street").writeAccount(account.getBillingStreet());
        new SFTextArea(driver, "Shipping Street").writeAccount(account.getShippingStreet());

        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
