package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseWithLoginTest {

    @Test
    public void account() {
        //ЛОГИН
        //ОТКРЫТЬ СТРАНИЦУ АККАУНТОВ
        //НАЖАТЬ NEW
        //ЗАПОЛНИТЬ ФОРМУ
        //SAVE
        //ПРОВЕРИТЬ ЛИСТ

        String accountName = "Nastya";
        accountListPage.open();
        assertTrue(accountListPage.isPageOpened(), "Страница аккаунтов не открылась");
        accountListPage.clickNewButton();
        accountListPage.setTextForInput("Account Name", accountName);
        accountListPage.setTextForInput("Website", "Nastya");
        accountListPage.setTextForInput("Phone", "Nastya");
        accountListPage.setTextForInput("Employees", "Nastya");
        accountListPage.setTextForInput("Billing City", "Nastya");
        accountListPage.setTextForInput("Billing Zip/Postal Code", "Nastya");
        accountListPage.setTextForInput("Billing State/Province", "Nastya");
        accountListPage.setTextForInput("Billing Country", "Nastya");
        accountListPage.setTextForInput("Shipping City", "Nastya");
        accountListPage.setTextForInput("Shipping Zip/Postal Code", "Nastya");
        accountListPage.setTextForInput("Shipping State/Province", "Nastya");
        accountListPage.setTextForInput("Shipping Country", "Nastya");
        accountListPage.selectItem("Type", "Press");
        accountListPage.selectItem("Industry", "Education");
        accountListPage.textArea("Description", "Nastya");
        accountListPage.textArea("Billing Street", "Nastya");
        accountListPage.textArea("Shipping Street", "Nastya");
        accountListPage.clickSaveButton();
        assertTrue(accountListPage.isAccountAdded(accountName), "Aккаунт не создался");
    }
}
