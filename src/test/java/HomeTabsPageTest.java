import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomeTabsBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class HomeTabsPageTest extends InitiationTestClass{

    private HomeTabsBasePage homeTabsPage = new HomeTabsBasePage();
    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void checkEqualElementHomeTabsPage()
    {
        Assertions.assertEquals("POPULAR",homeTabsPage.getHomePageTabsAElement().get(0).getText());
        Assertions.assertEquals("BEST SELLERS",homeTabsPage.getHomePageTabsAElement().get(1).getText());
    }

    @AfterAll
    public static void afterSession()
    {
        quitDriver();
    }


}