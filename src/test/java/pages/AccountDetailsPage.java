package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return false;
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Type", account.getType());
        validateInput("Website", account.getWebsite());
        validateInput("Phone", account.getPhone());
        validateInput("Description", account.getDescription());
        validateInput("Industry", account.getIndustry());
        validateInput("Employees", account.getEmployees());
        validateInput("Billing Address", String.format("%s\n%s, %s %s\n%s", account.getBillingStreet(),account.getBillingCity(),account.getBillingStateProvince(),
                account.getBillingZipPostalCode(),account.getBillingCountry()));
        validateInput("Shipping Address", String.format("%s\n%s, %s %s\n%s", account.getShippingStreet(),account.getShippingCity(),account.getShippingStateProvince(),
                account.getShippingZipPostalCode(),account.getShippingCountry()));
    }
}
