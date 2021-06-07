package tests;

import lombok.extern.log4j.Log4j2;
import models.Lead;
import models.LeadFactory;
import org.testng.annotations.Test;

@Log4j2
public class LeadTest extends BaseWithLoginTest {

    @Test(description = "Creating and validating an lead")
    public void creatingAndValidatingAnLead() {

        Lead lead = LeadFactory.get();

        leadListPage
                .open()
                .clickNew()
                .create(lead)
                .openDetailsTab()
                .validateLead(lead);
    }
}
