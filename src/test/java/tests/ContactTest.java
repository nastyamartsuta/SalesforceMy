package tests;

import lombok.extern.log4j.Log4j2;
import models.Contact;
import models.ContactFactory;
import org.testng.annotations.Test;

@Log4j2
public class ContactTest extends BaseWithLoginTest {

//    @Test(description = "Creating and validating an account", retryAnalyzer = Retry.class)
    @Test(description = "Creating and validating an account")
    public void creatingAndValidatingAnAccount() {

        Contact contact = ContactFactory.get();

        contactListPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);
    }
}
