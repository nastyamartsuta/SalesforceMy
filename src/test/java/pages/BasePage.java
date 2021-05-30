package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public static final String BASE_URL = "https://teachmeskills.lightning.force.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract boolean isPageOpened();

    public boolean isExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public void validateInput(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']" +
                "/ancestor::force-record-layout-item//slot[@slot='outputField']//child::*";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }
}
