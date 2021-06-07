package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import tests.base.Retry;

@Log4j2
public class AccountTest extends BaseWithLoginTest {

//    @Test(description = "Creating and validating an account", retryAnalyzer = Retry.class)
    @Test(description = "Creating and validating an account")
    public void creatingAndValidatingAnAccount() {
        //ЛОГИН
        //ОТКРЫТЬ СТРАНИЦУ АККАУНТОВ
        //НАЖАТЬ NEW
        //ЗАПОЛНИТЬ ФОРМУ
        //SAVE
        //ПРОВЕРИТЬ ЛИСТ

        Account account = AccountFactory.get();

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
