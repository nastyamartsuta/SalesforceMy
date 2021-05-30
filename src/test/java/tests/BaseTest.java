package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.AccountListPage;
import pages.ContactListPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    AccountListPage accountListPage;
    ContactListPage contactListPage;

//    @Parameters({"browser"})
    @BeforeMethod(description = "Open Browser")
//    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {

//        if (browser.equals("chrome")) {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //НЕЯВНЫЕ ОЖИДАНИЯ
//        } else if (browser.equals("opera")) {
//            WebDriverManager.operadriver().setup();
//            driver = new OperaDriver();
//        }
//        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        accountListPage = new AccountListPage(driver);
        contactListPage = new ContactListPage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Close Browser")
    public void tearDown() {
        driver.quit();
    }
}
