import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TabContentPageTest extends InitiationTestClass{
    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void checkProductListElementSize()
    {
        TabContentPage tabContentPage = new TabContentPage(driver);
        Assertions.assertEquals(7,tabContentPage.getProductListElement().size());
        Assertions.assertEquals(28,tabContentPage.getProductListPriceElement().size());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }

}