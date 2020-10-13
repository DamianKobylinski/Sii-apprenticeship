import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.TabContentBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class TabContentPageTest extends InitiationTestClass{
    private static WebDriver driver;
    private TabContentBasePage tabContentPage = new TabContentBasePage();

    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void checkProductListElementSize()
    {
        Assertions.assertEquals(7,tabContentPage.getProductListPriceElement().size());
    }

    @AfterAll
    public static void afterSession()
    {
        quitDriver();
    }

}