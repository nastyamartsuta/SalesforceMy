package tests;

import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class BaseWithLoginTest extends BaseTest {
    @Override
    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginPage.open();
        assertTrue(loginPage.isPageOpened(), "Страница логина не открылась");
        HomePage homePage = loginPage.login("nastya.martsuta-gugr@force.com", "password97" );
        assertTrue(homePage.isPageOpened(), "Страница Home Page не открылась");
    }
}
