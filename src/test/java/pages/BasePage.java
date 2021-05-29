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

//    String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//" +
//            "lightning-formatted-text";
//
//    String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item" +
//            "//slot[@slot='outputField']//child::*";
//
//    String fieldLocator = "//span[text()='%s']/ancestor::force-record-layout-item//*[@data-output-element-id='output-field']";
//    String textLocator = BaseLocator + fieldLocator;
//    String addressLocator = BaseLocator + fieldLocator + "/a";
//    public static String BaseLocator = "//div[contains(@class,'active')]";

    public void validateInput(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']" +
                "/ancestor::force-record-layout-item//slot[@slot='outputField']//child::*";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

//    public void validateA(String label, String expected) {
//        String locator = "//div[contains(@class,'active')]//span[text()='%s']" +
//                "/ancestor::force-record-layout-item//a";
//        assertEquals(
//                driver.findElement(By.xpath(String.format(locator, label))).getText(),
//                expected, "A text is not correct"
//        );
//    }
//
//    public void validateNumber(String label, String expected) {
//        String locator = "//div[contains(@class,'active')]//span[text()='%s']" +
//                "/ancestor::force-record-layout-item//lightning-formatted-number";
//        assertEquals(
//                driver.findElement(By.xpath(String.format(locator, label))).getText(),
//                expected, "Employees number is not correct"
//        );
//    }

//    public void validateAddress(String label, String[] expected) {
//        String locator = "//div[contains(@class,'active')]//span[text()='%s']" +
//                "/ancestor::force-record-layout-item//lightning-formatted-address/a";
//        String addressText = driver.findElement(By.xpath(String.format(locator, label))).getText();
//        for (String s : expected) {
//            boolean isAddressCorrect = addressText.contains(s);
//            assertTrue(isAddressCorrect, "Address text is not correct");
//        }
//    }
}
