package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.AccountListPage;
import pages.ContactListPage;
import pages.LeadListPage;
import pages.LoginPage;
import tests.base.TestListener;

import java.util.concurrent.TimeUnit;

@Log4j2
//@Listeners(TestListener.class)
public class BaseTest {

    protected LoginPage loginPage;
    protected AccountListPage accountListPage;
    protected ContactListPage contactListPage;
    protected LeadListPage leadListPage;
    WebDriver driver;
    WebDriverWait wait;


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
        leadListPage = new LeadListPage(driver);
    }

//    @AfterMethod(alwaysRun = true, description = "Close Browser")
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
