import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.TabContentBasePage;

import java.time.Duration;

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
        Assertions.assertEquals(7, tabContentPage.getProductListPriceElementsList().size());
    }

    @Test
    public void clickAddToCartButtonAndCheckPriceOfElements() {
        Wait waitForPopUp = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(Exception.class);

        if(popUpCheckoutPage.getEmptyCartTextDisplay().isDisplayed()) {

            float totalProductsPrice = 0;
            SoftAssertions softAssert = new SoftAssertions();

            totalProductsPrice += Float.parseFloat(tabContentPage.getProductListPriceElement(0).getText().replace("$",""));
            String nameOfTheProductAtProductView = tabContentPage.getNameOfProductElement(0).getAttribute("title");
            tabContentPage.scrollToProductElementAndHoverMouseOnIt(0);
            tabContentPage.takeElementsValueAndClickOnAddToCartAction(waitForPopUp, 0);
            String nameOfTheProductAtPopUpView = popUpCheckoutPage.getCartProductNameElement().getText();
            softAssert.assertThat(tabContentPage.getProductListPriceElement(0).getText()).isEqualTo(popUpCheckoutPage.getCartProductInfoOfTheProduct().get(3).getText());
            softAssert.assertThat(nameOfTheProductAtProductView).isEqualTo(nameOfTheProductAtPopUpView);
            popUpCheckoutPage.getContinueShoppingElement().click();

            softAssert.assertAll();
        }
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}