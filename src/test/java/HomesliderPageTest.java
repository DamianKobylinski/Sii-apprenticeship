import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class HomesliderPageTest extends InitiationTestClass{

    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void checkHomesliderLiElementSize()
    {
        HomesliderPage homesliderPage = new HomesliderPage(driver);
        Assertions.assertEquals(5,homesliderPage.getHomeslidersLiElementSize());
    }

    @Test
    public void checkHomesliderTopLiElementSize()
    {
        HomesliderPage homesliderPage = new HomesliderPage(driver);
        Assertions.assertEquals(2,homesliderPage.getHomeslidersTopLiElementSize());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }

}