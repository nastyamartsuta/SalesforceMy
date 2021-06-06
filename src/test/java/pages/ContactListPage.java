package pages;

import io.qameta.allure.Step;
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

    @Step("Open contact page")
    public ContactListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/home");
        return this;
    }

    @Step("Click NEW button on contact page")
    public ContactModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactModal(driver);
    }
}
