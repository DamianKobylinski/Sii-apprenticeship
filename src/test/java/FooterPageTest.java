import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class FooterPageTest extends InitiationTestClass{

    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void checkListOfNavigatorsElementSize()
    {
        FooterPage footerPage = new FooterPage(driver);
        Assertions.assertEquals(8,footerPage.getListOfNavigatorsElement().size());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }


}