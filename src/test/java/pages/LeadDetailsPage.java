package pages;

import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return false;
    }

    @Step("Open details tab on contact page")
    public LeadDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    @Step("Validating new lead page")
    public void validateLead(Lead lead) {
        validateInput("Lead Status", lead.getLeadStatus());
        validateInput("Name", String.format(lead.getSalutation()+" "+lead.getFirstName()+" "+lead.getMiddleName()+" "
                +lead.getLastName()+" "+lead.getSuffix()));
        validateInput("Title", lead.getTitle());
        validateInput("Email", lead.getEmail());
        validateInput("Phone", lead.getPhone());
        validateInput("Mobile", lead.getMobile());
//        validateInput("Rating", lead.getRating());
        validateInput("Website", lead.getWebsite());
        validateInput("Company", lead.getCompany());
        validateInput("Industry", lead.getIndustry());
        validateInput("No. of Employees", lead.getNoOfEmployees());
        validateInput("Lead Source", lead.getLeadSource());
        validateInput("Address", String.format("%s\n%s, %s %s\n%s", lead.getStreet(),lead.getCity(),lead.getStateProvince(),
                lead.getZipPostalCode(),lead.getCountry()));
    }
}
