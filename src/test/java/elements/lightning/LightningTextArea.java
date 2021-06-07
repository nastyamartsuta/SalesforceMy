package elements.lightning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LightningTextArea {
    WebDriver driver;
    String label;
    String textAreaLocatorContact = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/parent::lightning-textarea[contains(@class, 'slds-form-element')]//textarea";

    public LightningTextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeContact(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(textAreaLocatorContact, label))).sendKeys(text);
    }
}
