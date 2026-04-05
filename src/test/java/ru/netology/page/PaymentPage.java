package ru.netology.page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PaymentPage {

    public void fillForm(String card, String month, String year, String owner, String cvc) {
        $x("//input[@placeholder='0000 0000 0000 0000']").setValue(card);
        $x("//input[@placeholder='08']").setValue(month);
        $x("//input[@placeholder='22']").setValue(year);
        $x("//input[@placeholder='IVAN IVANOV']").setValue(owner);
        $x("//input[@placeholder='999']").setValue(cvc);
        $x("//button[contains(text(),'Продолжить')]").click();
    }

    public void checkSuccess() {
        $x("//*[contains(text(),'Успешно')]").shouldBe(visible);
    }

    public void checkError() {
        $x("//*[contains(text(),'Ошибка')]").shouldBe(visible);
    }
}
