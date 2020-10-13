import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HeaderBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class HeaderPageTest extends InitiationTestClass {

    private HeaderBasePage headerPage = new HeaderBasePage();

    @BeforeAll
    public static void beforeSession() {
        openUrl(websiteURL);
    }

    @Test
    public void LogoHeaderElementIsDisplayedTest() {
        Assertions.assertTrue(headerPage.checkIfLogoHeaderElementIsDisplayed());
    }

    @Test
    public void formHeaderElementAttributeMethodTest() {
        Assertions.assertEquals("get", headerPage.getFormHeaderElementAttribute());
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}