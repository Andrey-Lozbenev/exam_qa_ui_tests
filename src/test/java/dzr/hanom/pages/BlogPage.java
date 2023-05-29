package dzr.hanom.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BlogPage {
    public final SelenideElement

            blogPageH1Element = $(".blog__title"),
            rightNewsInBlog = $(".blog__items").$(byText("Интеграция Cloudmaster с Yandex Cloud")),
            RightNewsTitle = $(".article-header").$(byText("Интеграция Cloudmaster с Yandex Cloud")),
            buttonMoreNews = $(".blog__button");

    public final ElementsCollection
            newsItems = $$(".item-news").filter(visible);


    public BlogPage openRightNewsInBlog() {
        rightNewsInBlog.click();
        return this;
    }

    public BlogPage addMoreNews() {
        buttonMoreNews.click();
        return this;
    }
}
