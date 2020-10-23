import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.BannerBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class BannerPageTest extends InitiationTestClass {

    static BannerBasePage bannerpage = new BannerBasePage();

    @BeforeAll
    public static void beforeSession() {
        openUrl(websiteURL);
    }

    @Test
    public static void getTextFromBanner() {
        Assertions.assertEquals("0123-456-789", bannerpage.getBannerText());
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }
}