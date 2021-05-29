package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("nastya.martsuta-gugr@force.com", "password97" )
                .isPageOpened();
        assertTrue(isOpened, "Страница Home Page не открылась");

//        loginPage.open();
//        assertTrue(loginPage.isPageOpened(), "Страница логина не открылась");
//        loginPage.login("nastya.martsuta-gugr@force.com", "password97" );
//        assertTrue(homePage.isPageOpened(), "Страница Home Page не открылась");
    }
}
