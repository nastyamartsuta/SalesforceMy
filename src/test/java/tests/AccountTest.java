package tests;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseWithLoginTest {

    @Test
    public void accountShouldBeCreated() {
        //ЛОГИН
        //ОТКРЫТЬ СТРАНИЦУ АККАУНТОВ
        //НАЖАТЬ NEW
        //ЗАПОЛНИТЬ ФОРМУ
        //SAVE
        //ПРОВЕРИТЬ ЛИСТ

        Account account = new Account("Nastya", "375336346622", "tut.by", "",
                "Minsk", "220107", "Minsk", "Belarus",
                "Zelva", "231940", "Zelva", "Belarus",
                "Analyst", "Banking", "Delivery only on weekdays", "Narodnaya", "Pobedu");

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
