import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

class NavBarPageTest extends InitiationTestClass{
    private static WebDriver driver;

    @BeforeAll
    public static void beforeSession()
    {
        driver = createDriver();
        driver.get(websiteURL);
    }

    @Test
    public void NavBarImageIsDisplayedTest()
    {
        NavBarPage navbarPage = new NavBarPage(driver);
        Assertions.assertEquals(true,navbarPage.checkIfNavBarImageIsDisplayed());
    }

    @Test
    public void checkNavBarMenuElementsValue()
    {
        NavBarPage navbarPage = new NavBarPage(driver);
        List<WebElement> listOfNavBarElements = navbarPage.getNavBarMenuElements();
        Assertions.assertEquals("Sign in",listOfNavBarElements.get(0).getText());
        Assertions.assertEquals("Contact us",listOfNavBarElements.get(1).getText());
    }

    @AfterAll
    public static void afterSession()
    {
        driver.quit();
    }
}