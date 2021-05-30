package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    By title = By.xpath("//span[text()='Contacts']");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(title);
    }

    public ContactListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/home");
        return this;
    }

    public ContactModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactModal(driver);
    }
}
