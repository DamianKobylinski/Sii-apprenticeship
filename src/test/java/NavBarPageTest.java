import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.NavBarBasePage;

import java.util.List;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

class NavBarPageTest extends InitiationTestClass{
    private static WebDriver driver;
    private NavBarBasePage navbarPage = new NavBarBasePage();

    @BeforeAll
    public static void beforeSession()
    {
        openUrl(websiteURL);
    }

    @Test
    public void NavBarImageIsDisplayedTest()
    {
        Assertions.assertTrue(navbarPage.checkIfNavBarImageIsDisplayed());
    }

    @Test
    public void checkNavBarMenuElementsValue()
    {
        List<WebElement> listOfNavBarElements = navbarPage.getNavBarMenuElements();
        Assertions.assertEquals("Sign in",listOfNavBarElements.get(0).getText());
        Assertions.assertEquals("Contact us",listOfNavBarElements.get(1).getText());
    }

    @AfterAll
    public static void afterSession()
    {
        quitDriver();
    }
}