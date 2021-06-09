package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    By title = By.xpath("//span[text()='Leads']");

    public LeadListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(title);
    }

    @Step("Open lead page")
    public LeadListPage open() {
        driver.get(BASE_URL + "/lightning/o/Lead/home");
        return this;
    }

    @Step("Click NEW button on lead page")
    public LeadModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new LeadModal(driver);
    }
}
