package tests;

import models.Contact;
import org.testng.annotations.Test;

public class ContactTest extends BaseWithLoginTest {

    @Test(description = "Creating and validating an account", retryAnalyzer = Retry.class)
    public void creatingAndValidatingAnAccount() {

        Contact contact = new Contact("Ms.", "contact", "contact",
                "contact", "contact", "contact", "nastya@mail.ru", "35565",
                "3456514", "contact", "26325", "contact",
                "contact", "231940", "contact",
                "contact", "contact", "Nastya");

        contactListPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);
    }
}
