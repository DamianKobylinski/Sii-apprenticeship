import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.FooterBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class FooterPageTest extends InitiationTestClass{

    private FooterBasePage footerPage = new FooterBasePage();

    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void checkListOfNavigatorsElementSize()
    {
        Assertions.assertEquals(8,footerPage.getListOfNavigatorsElement().size());
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}