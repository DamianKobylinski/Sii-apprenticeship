import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomeFooterBasePage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class HomeFooterPageTest extends InitiationTestClass{

    private static WebDriver driver;
    private HomeFooterBasePage homeFooterPage = new HomeFooterBasePage();

    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void checkListElementMethodValue()
    {
        for (int i = 0; i < homeFooterPage.getListOfHtmlContentElement().size(); i++) {
            String ListOfHtmlContentElementAttribute = homeFooterPage.getListOfHtmlContentElement().get(i).getAttribute("href");
            Assertions.assertEquals("http://www.prestashop.com/",ListOfHtmlContentElementAttribute);
        }
    }

    @Test
    public void checkSeleniumFrameworkButtonElementAttribute()
    {
        Assertions.assertEquals("http://www.seleniumframework.com/",homeFooterPage.getSeleniumFrameworkButtonElementAttribute());
    }

    @AfterAll
    public static void afterSession()
    {
        quitDriver();
    }

}