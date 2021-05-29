package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");
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


    public AccountListPage clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return this;
    }

    public AccountListPage setTextForInput(String name, String text) {
        driver.findElement(By.xpath(String.format("//label/span[text()='%s']/parent::*/parent::*//input", name)))
                .sendKeys(text);
        return this;
    }

    public AccountListPage selectItem(String name, String text) {
        driver.findElement(By.xpath(String.format("//span[text()='%s']/parent::*/parent::*//a", name)))
                .sendKeys(text);
        return this;
    }

    public AccountListPage textArea(String name, String text) {
        driver.findElement(By.xpath(String.format("//label/span[text()='%s']/parent::*/parent::*//textarea", name)))
                .sendKeys(text);
        return this;
    }

    public AccountListPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }

    public boolean isAccountAdded(String name) {
        return isExist(By.xpath(String.format("//span[text()='%s']", name)));
    }
}
