package elements.lightning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LightningInput {
    WebDriver driver;
    String label;
//    String inputLocatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
//            "/parent::lightning-input[contains(@class, 'slds-form-element')]//input";

    String inputLocatorContact = "//*[contains(@class,'isModal')]//label[text()='%s']" +
            "/ancestor::lightning-input//input";

    public LightningInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeContact(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(inputLocatorContact, label))).sendKeys(text);
    }
}
