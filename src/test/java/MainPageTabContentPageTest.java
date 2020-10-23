import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.MainPageTabContent;
import pages.PopUpCheckoutPage;

import java.time.Duration;
import java.util.function.Function;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.getDriver;
import static pages.BasePage.quitDriver;

class MainPageTabContentPageTest extends InitiationTestClass {
    private final MainPageTabContent mainPageTabContentPage = new MainPageTabContent();
    private final PopUpCheckoutPage popUpCheckoutPage = new PopUpCheckoutPage();
    @BeforeAll
    public static void beforeSession() {
        openUrl(websiteURL);
    }

    @Test
    public void checkProductListElementSize() {
        Assertions.assertEquals(7, mainPageTabContentPage.getProductListPriceElementsList().size());
    }

    @Test
    public void checkNameOfBuyingProduct() {
        mainPageTabContentPage.tabProductActions(0);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return popUpCheckoutPage.getCartProductName();
            }
        });
        Assertions.assertEquals(mainPageTabContentPage.getProductName(0),foo.getText());
        popUpCheckoutPage.clickContinueShoppingButton();
    }

    @Test
    public void checkPriceValueOfBuyingProduct()
    {
        mainPageTabContentPage.tabProductActions(0);

        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return popUpCheckoutPage.getTotalProductsPrice();
            }
        });

        Assertions.assertEquals(mainPageTabContentPage.getProductPrice(0) ,Float.parseFloat(foo.getText().replace("$","")));
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}