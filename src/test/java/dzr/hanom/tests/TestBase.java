package dzr.hanom.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import dzr.hanom.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Configuration.remote;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static dzr.hanom.config.PropertiesConfig.PROP;
import static dzr.hanom.helpers.Attach.*;

public class TestBase {
    @BeforeAll
    public static void addConfig() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.baseUrl = PROP.getBaseUrl();
        Configuration.browserSize = PROP.getBrowserSize();
        Configuration.browserVersion = PROP.getBrowserVersion();
        Configuration.browser = PROP.getBrowserName();
        Configuration.pageLoadStrategy = PROP.getPageLoadStrategy();
        Configuration.headless = PROP.isHeadless();


        if (PROP.isRemote()) {
            Configuration.remote = PROP.getRemoteUrl();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setAcceptInsecureCerts(false);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }
    @BeforeEach
    void openPage() {
        open("");
    }
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//    }

    @AfterEach
    public void tearDown() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();

        if (PROP.isRemote()) {
            addVideo();
        }
    }
}
