package elements.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SFTextArea {
    WebDriver driver;
    String label;
    String textAreaLocatorAccount = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//textarea";

    public SFTextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeAccount(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(textAreaLocatorAccount, label))).sendKeys(text);
    }
}
