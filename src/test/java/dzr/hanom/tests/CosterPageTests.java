package dzr.hanom.tests;

import dzr.hanom.components.ResultComponents;
import dzr.hanom.pages.LandingPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CosterPageTests extends TestBase {

    LandingPage landingPage = new LandingPage();
    ResultComponents resultComponents = new ResultComponents();

    @Epic("UI tests cloudmaster.ru")
    @Feature("Coster page")
    @Test
    @DisplayName("При клике на Coster идет переброс на страницу, на которой есть текст 'FinOps-решение для бюджетирования, контроля и оптимизации расходов'")
    void successfulOpenCosterPageTest() {
        step("Открываем вкладку Coster", () -> {
            landingPage.openCosterPage();
        });
        step("Проверяем, что во вкладку Coster есть запись 'FinOps-решение для бюджетирования, контроля и оптимизации расходов'", () -> {
            resultComponents.checkSuccessfulOpeningCosterPage();
        });
    }


    @Test
    @DisplayName("На странице Coster отображается форма обратной связи")
    void costerPageShouldHaveCallbackForm() {
        step("Открываем вкладку Coster", () -> {
            landingPage.openCosterPage();
        });
        step("Проверяем, что во вкладку Coster отображается форма обратной связи", () -> {
            resultComponents.checkSuccessfulVisibilityCallbackForm();
        });
    }
}
