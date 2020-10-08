import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class HeaderPageTest extends InitiationTestClass{

    private static WebDriver driver;


    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void LogoHeaderElementIsDisplayedTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertEquals(true,headerPage.checkIfLogoHeaderElementIsDisplayed());
    }

    @Test
    public void formHeaderElementAttributeMethodTest()
    {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertEquals("get",headerPage.getFormHeaderElementAttribute());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }

}