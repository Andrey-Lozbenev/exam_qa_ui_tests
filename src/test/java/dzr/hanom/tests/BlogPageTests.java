package dzr.hanom.tests;

import com.codeborne.selenide.Selenide;
import dzr.hanom.components.ResultComponents;
import dzr.hanom.pages.BlogPage;
import dzr.hanom.pages.LandingPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BlogPageTests extends TestBase {
    LandingPage landingPage = new LandingPage();
    BlogPage blogPage = new BlogPage();
    ResultComponents resultComponents = new ResultComponents();
    @Epic("UI tests cloudmaster.ru")
    @Feature("Blog page")
    @Test
    @DisplayName("При переходе во вкладку Блог есть запись `Блог Cloudmaster`")
    void successfulOpenBlogPageTest() {
        step("Открываем вкладку Блог", () -> {
            landingPage.openBlogPage();
        });
        step("Проверяем, что во вкладку Блог есть запись `Блог Cloudmaster`", () -> {
            resultComponents.checkSuccessfulOpeningBlogPage();
            Selenide.closeWebDriver();
        });

    }

    @Test
    @DisplayName("Открывается нужный блог при клике на новость из списка")
    void successfulOpenRightNewsInBlogRightNewsInBlog() {
        step("Закрываем всплывающее окно Cookies", () -> {
            landingPage.closeCookie();
        });
        step("Открываем вкладку Блог", () -> {
            landingPage.openBlogPage();
        });
        step("Кликаем на новость 'Интеграция Cloudmaster с Yandex Cloud'", () -> {
            blogPage.openRightNewsInBlog();
        });
        step("Проверяем, что во вкладку Блог есть запись `Интеграция Cloudmaster с Yandex Cloud`", () -> {
            resultComponents.checkSuccessfulOpeningRightNewsInBlog();
        });

    }


    @Test
    @DisplayName("При нажатии на кнопку 'Загрузить еще' подгружаются еще новости")
    void successfulAddedMoreNews() {
        step("Закрываем всплывающее окно Cookies", () -> {
            landingPage.closeCookie();
        });
        step("Открываем вкладку Блог", () -> {
            landingPage.openBlogPage();
        });
        step("Кликаем на кнопку 'Добавить еще'", () -> {
            blogPage.addMoreNews();
        });
        step("Проверяем, что добавилис еще новости", () -> {
            resultComponents.checkSuccessfulAddedMoreNews();
        });
    }


}
