import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class HomeFooterPageTest extends InitiationTestClass{

    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void checkListElementMethodValue()
    {
        HomeFooterPage homeFooterPage = new HomeFooterPage(driver);
        for (int i = 0; i < homeFooterPage.getListOfHtmlContentElement().size(); i++) {
            String ListOfHtmlContentElementAttribute = homeFooterPage.getListOfHtmlContentElement().get(i).getAttribute("href");
            Assertions.assertEquals("http://www.prestashop.com/",ListOfHtmlContentElementAttribute);
        }
    }

    @Test
    public void checkSeleniumFrameworkButtonElementAttribute()
    {
        HomeFooterPage homeFooterPage = new HomeFooterPage(driver);
        Assertions.assertEquals("http://www.seleniumframework.com/",homeFooterPage.getSeleniumFrameworkButtonElementAttribute());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }

}