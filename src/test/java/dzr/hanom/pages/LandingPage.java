package dzr.hanom.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LandingPage {
    public final SelenideElement
            costerFromFooter = $(".footer").$(byText("Coster")),
            blogFromHeader = $(".header").$(byText("Блог")),
            demoButtonFromHeader = $(".header").$(byText("Запросить демо")),
            popupSubmitButton = $(".popup__button"),
            popupForm = $(".popup__form"),
            popupCloseElement = $(".popup__header-icon"),
            nameInputFromPopupForm = $("[name=name]"),
            emailInputFromPopupForm = $("[name=email]"),
            phoneInputFromPopupForm = $("[name=phone_number]"),
            buttonCoockie = $(".cookie__button");

    public LandingPage openCosterPage() {
        costerFromFooter.click();
        return this;
    }

    public LandingPage openBlogPage() {
        blogFromHeader.click();
        return this;
    }

    public LandingPage openDemoPopup() {
        demoButtonFromHeader.click();
        return this;
    }

    public LandingPage closeDemoPopup() {
        popupCloseElement.click();
        return this;
    }
    public LandingPage closeCookie() {
        buttonCoockie.click();
        return this;
    }

}
