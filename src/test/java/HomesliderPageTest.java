import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomesliderBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class HomesliderPageTest extends InitiationTestClass{

    private HomesliderBasePage homesliderPage = new HomesliderBasePage();
    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void checkHomesliderLiElementSize()
    {
        Assertions.assertEquals(5,homesliderPage.getHomeslidersLiElementSize());
    }

    @Test
    public void checkHomesliderTopLiElementSize()
    {
        Assertions.assertEquals(2,homesliderPage.getHomeslidersTopLiElementSize());
    }

    @AfterAll
    public static void afterSession()
    {
        quitDriver();
    }

}