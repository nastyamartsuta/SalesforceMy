package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocatorAccount = "//*[contains(@class,'modal-body')]//span[text() ='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//input";
    String inputLocatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/parent::lightning-input[contains(@class, 'slds-form-element')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeAccount(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(inputLocatorAccount, label))).sendKeys(text);
    }

    public void writeContact(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(inputLocatorContact, label))).sendKeys(text);
    }
}
