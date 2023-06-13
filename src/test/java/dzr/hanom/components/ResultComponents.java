package dzr.hanom.components;

import com.codeborne.selenide.CollectionCondition;
import dzr.hanom.pages.BlogPage;
import dzr.hanom.pages.CosterPage;

import static com.codeborne.selenide.Condition.text;

public class ResultComponents {

    CosterPage costerPage = new CosterPage();
    BlogPage blogPage = new BlogPage();

    public void checkSuccessfulOpeningCosterPage() {
        costerPage.costerPageH1Element.shouldHave(text("FinOps-решение для контроля и учета затрат на ИТ-инфраструктуру"));

    }

    public void checkSuccessfulOpeningBlogPage() {
        blogPage.blogPageH1Element.shouldHave(text("Блог Cloudmaster"));

    }

    public void checkSuccessfulOpeningRightNewsInBlog() {
        blogPage.RightNewsTitle.shouldHave(text("Интеграция Cloudmaster с Yandex Cloud"));

    }

    public void checkSuccessfulAddedMoreNews() {
        blogPage.newsItems.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(18));
    }

    public void checkSuccessfulVisibilityCallbackForm() {
        costerPage.callbackForm.shouldHave(text("Остались вопросы?"));
    }

}
