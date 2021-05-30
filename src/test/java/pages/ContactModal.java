package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class ContactModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Contact']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Fill in form for new contact")
    public ContactDetailsPage create(Contact contact) {
        new DropDown(driver, "Salutation").selectContact(contact.getSalutation());
        new Input(driver, "First Name").writeContact(contact.getFirstName());
        new Input(driver, "Middle Name").writeContact(contact.getMiddleName());
        new Input(driver, "Last Name").writeContact(contact.getLastName());
        new Input(driver, "Suffix").writeContact(contact.getSuffix());
        new Input(driver, "Title").writeContact(contact.getTitle());
        new Input(driver, "Email").writeContact(contact.getEmail());
        new Input(driver, "Phone").writeContact(contact.getPhone());
        new Input(driver, "Mobile").writeContact(contact.getMobile());
        new Input(driver, "Department").writeContact(contact.getDepartment());
        new Input(driver, "Fax").writeContact(contact.getFax());
//        new Input(driver, "Mailing Address").write(contact.getMailingAddress());
        new Input(driver, "Mailing City").writeContact(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").writeContact(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing State/Province").writeContact(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").writeContact(contact.getMailingCountry());
        new TextArea(driver, "Mailing Street").writeContact(contact.getMailingStreet());
        new DropDown(driver, "Account Name").selectSearchContact(contact.getAccountName());
        save();
        AllureUtils.takeScreenshot(driver);
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
