import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class HomeTabsPageTest extends InitiationTestClass{

    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void checkEqualElementHomeTabsPage()
    {
        HomeTabsPage homeTabsPage = new HomeTabsPage(driver);
        Assertions.assertEquals("POPULAR",homeTabsPage.getHomePageTabsAElement().get(0).getText());
        Assertions.assertEquals("BEST SELLERS",homeTabsPage.getHomePageTabsAElement().get(1).getText());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }


}