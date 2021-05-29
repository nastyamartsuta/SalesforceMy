package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    By title = By.xpath("//span[text()='Accounts']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(title);
    }

    public AccountListPage open() {
        driver.get(BASE_URL + "/lightning/o/Account/home");
        return this;
    }

    public AccountModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }
}
