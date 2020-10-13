import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.TabContentBasePage;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.getDriver;
import static pages.BasePage.quitDriver;

class TabContentPageTest extends InitiationTestClass {
    private TabContentBasePage tabContentPage = new TabContentBasePage();
    private PopUpCheckoutPage popUpCheckoutPage = new PopUpCheckoutPage();
    @BeforeAll
    public static void beforeSession() {
        openUrl(websiteURL);
    }

    @Test
    public void checkProductListElementSize() {
        Assertions.assertEquals(7, tabContentPage.getProductListPriceElement().size());
    }

    @Test
    public void clickAddToCartButton() {
        tabContentPage.buttonContainerElement();
        Wait waitForPopUp = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(Exception.class);

//        WebElement getCheckoutButton = waitForPopUp.until(new Function<WebElement, Void>() {
//            @Override
//            public Void apply(WebElement webElement) {
//                List<WebElement> addToCartButtons = tabContentPage.getBlockRightTabProductElements();
//                addToCartButtons.get(0).click();
//                return null;
//            }
//        });
//        getCheckoutButton.click();
        WebElement checkOut = (WebElement) waitForPopUp.until(new Function<WebElement, WebElement>() {
            @Override
            public WebElement apply(WebElement webElement) {
                List<WebElement> addToCartButtons = tabContentPage.getBlockRightTabProductElements();
                return addToCartButtons.get(0);
            }
        });
        checkOut.click();
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}