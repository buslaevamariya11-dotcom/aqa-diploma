package ru.netology.page;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void openSite() {
        open("http://localhost:8080");
    }

    public void clickBuy() {
        $x("//button[contains(text(),'Купить')]").click();
    }

    public void clickCredit() {
        $x("//button[contains(text(),'Купить в кредит')]").click();
    }
}
