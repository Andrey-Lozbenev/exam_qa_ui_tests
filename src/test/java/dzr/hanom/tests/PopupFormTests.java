package dzr.hanom.tests;

import com.codeborne.selenide.Condition;
import dzr.hanom.pages.LandingPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.step;

public class PopupFormTests extends TestBase {

    LandingPage landingPage = new LandingPage();

    @Epic("UI tests cloudmaster.ru")
    @Feature("Popup")
    @ParameterizedTest(name = "При вводе некорректных значений для полей email и телефон выводится нужный текст ошибки {3}")
    @CsvSource(value = {
            "Василий,           test.ru,   70000000000, Введите валидный email",
            "Василий,           test@test.ru,   7000000000, Введите корректный телефон"
    })
    void errorMessageInWidgetShouldBeChanged(String testName, String testEmail, String testPhone, String errorMessage) {
        step("Открываем поп-ап формы заявки", () -> {
            landingPage.openDemoPopup();
        });
        step("Заполняем поля в формы заявки", () -> {
            landingPage.nameInputFromPopupForm.setValue(testName);
            landingPage.emailInputFromPopupForm.setValue(testEmail);
            landingPage.phoneInputFromPopupForm.setValue(testPhone);
        });
        step("Подтверждаем ввод данных в форме", () -> {
            landingPage.popupSubmitButton.click();
        });
        step("Проверяем текст ошибки", () -> {
            landingPage.popupForm.shouldHave(Condition.text(errorMessage));
        });
        step("Закрываем поп-ап", () -> {
            landingPage.closeDemoPopup();
        });
    }
}
