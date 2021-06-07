package pages;

import elements.lightning.LightningDropDown;
import elements.lightning.LightningInput;
import elements.lightning.LightningTextArea;
import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class LeadModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Lead']");
    public static final By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");

    public LeadModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Fill in form for new lead")
    public LeadDetailsPage create(Lead lead) {
        new LightningDropDown(driver, "Lead Status").selectContact(lead.getLeadStatus());
        new LightningDropDown(driver, "Salutation").selectContact(lead.getSalutation());
//        new LightningDropDown(driver, "Rating").selectContact(lead.getRating());
//        new LightningDropDown(driver, "Industry").selectContact(lead.getIndustry());
//        new LightningDropDown(driver, "Lead Source").selectContact(lead.getLeadSource());
        new LightningInput(driver, "Website").writeContact(lead.getWebsite());
        new LightningInput(driver, "First Name").writeContact(lead.getFirstName());
        new LightningInput(driver, "Middle Name").writeContact(lead.getMiddleName());
        new LightningInput(driver, "Last Name").writeContact(lead.getLastName());
        new LightningInput(driver, "Suffix").writeContact(lead.getSuffix());
        new LightningInput(driver, "Title").writeContact(lead.getTitle());
        new LightningInput(driver, "Email").writeContact(lead.getEmail());
        new LightningInput(driver, "Phone").writeContact(lead.getPhone());
        new LightningInput(driver, "Mobile").writeContact(lead.getMobile());
        new LightningInput(driver, "Company").writeContact(lead.getCompany());
//        new LightningInput(driver, "No. Of Employees").writeContact(lead.getNoOfEmployees());
//        new LightningInput(driver, "Address").writeContact(lead.getAddress());
        new LightningInput(driver, "City").writeContact(lead.getCity());
        new LightningInput(driver, "Zip/Postal Code").writeContact(lead.getZipPostalCode());
        new LightningInput(driver, "State/Province").writeContact(lead.getStateProvince());
        new LightningInput(driver, "Country").writeContact(lead.getCountry());
        new LightningTextArea(driver, "Street").writeContact(lead.getStreet());
                save();
        AllureUtils.takeScreenshot(driver);
        return new LeadDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}

