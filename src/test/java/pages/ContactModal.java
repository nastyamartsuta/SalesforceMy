package pages;

import elements.lightning.LightningDropDown;
import elements.lightning.LightningInput;
import elements.lightning.LightningTextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class ContactModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Lead']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Fill in form for new contact")
    public ContactDetailsPage create(Contact contact) {
        new LightningDropDown(driver, "Salutation").selectContact(contact.getSalutation());
        new LightningInput(driver, "First Name").writeContact(contact.getFirstName());
        new LightningInput(driver, "Middle Name").writeContact(contact.getMiddleName());
        new LightningInput(driver, "Last Name").writeContact(contact.getLastName());
        new LightningInput(driver, "Suffix").writeContact(contact.getSuffix());
        new LightningInput(driver, "Title").writeContact(contact.getTitle());
        new LightningInput(driver, "Email").writeContact(contact.getEmail());
        new LightningInput(driver, "Phone").writeContact(contact.getPhone());
        new LightningInput(driver, "Mobile").writeContact(contact.getMobile());
        new LightningInput(driver, "Department").writeContact(contact.getDepartment());
        new LightningInput(driver, "Fax").writeContact(contact.getFax());
//        new Input(driver, "Mailing Address").write(contact.getMailingAddress());
        new LightningInput(driver, "Mailing City").writeContact(contact.getMailingCity());
        new LightningInput(driver, "Mailing Zip/Postal Code").writeContact(contact.getMailingZipPostalCode());
        new LightningInput(driver, "Mailing State/Province").writeContact(contact.getMailingStateProvince());
        new LightningInput(driver, "Mailing Country").writeContact(contact.getMailingCountry());
        new LightningTextArea(driver, "Mailing Street").writeContact(contact.getMailingStreet());
        new LightningDropDown(driver, "Account Name").selectSearchContact(contact.getAccountName());
        save();
        AllureUtils.takeScreenshot(driver);
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
