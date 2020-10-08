import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class BannerPageTest extends InitiationTestClass{
    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void getTextFromBanner() {
        BannerPage bannerpage = new BannerPage(driver);
        Assertions.assertEquals("0123-456-789",bannerpage.getBannerText());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }
}