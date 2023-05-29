package dzr.hanom.tests;

import dzr.hanom.components.ResultComponents;
import dzr.hanom.pages.BlogPage;
import dzr.hanom.pages.LandingPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class BlogPageTests extends TestBase {
    LandingPage landingPage = new LandingPage();
    BlogPage blogPage = new BlogPage();
    ResultComponents resultComponents = new ResultComponents();

    @Test
    @DisplayName("При переходе во вкладку Блог есть запись `Блог Cloudmaster`")
    void successfulOpenBlogPageTest() {
        $(".cookie__button").click();
        step("Открываем вкладку Блог", () -> {
        landingPage.openBlogPage();
        });
        step("Проверяем, что во вкладку Блог есть запись `Блог Cloudmaster`", () -> {
        resultComponents.checkSuccessfulOpeningBlogPage();
        });
    }

    @Test
    @DisplayName("Открывается нужный блог при клике на новость из списка")
    void successfulOpenRightNewsInBlogRightNewsInBlog() {
        $(".cookie__button").click();
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
        $(".cookie__button").click();
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
