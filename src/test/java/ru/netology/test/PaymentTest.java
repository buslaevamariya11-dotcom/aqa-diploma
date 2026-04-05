package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.MainPage;
import ru.netology.page.PaymentPage;

public class PaymentTest {

    @Test
    void shouldApprovePayment() {
        MainPage mainPage = new MainPage();
        mainPage.openSite();
        mainPage.clickBuy();

        PaymentPage paymentPage = new PaymentPage();
        paymentPage.fillForm(
                DataHelper.approvedCard(),
                DataHelper.validMonth(),
                DataHelper.validYear(),
                DataHelper.validOwner(),
                DataHelper.validCVC()
        );

        paymentPage.checkSuccess();
    }

    @Test
    void shouldDeclinePayment() {
        MainPage mainPage = new MainPage();
        mainPage.openSite();
        mainPage.clickBuy();

        PaymentPage paymentPage = new PaymentPage();
        paymentPage.fillForm(
                DataHelper.declinedCard(),
                DataHelper.validMonth(),
                DataHelper.validYear(),
                DataHelper.validOwner(),
                DataHelper.validCVC()
        );

        paymentPage.checkError();
    }
}
