import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.MainPageTabContent;
import pages.PopUpCheckoutPage;

import java.time.Duration;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.getDriver;
import static pages.BasePage.quitDriver;

class MainPageTabContentPageTest extends InitiationTestClass {
    private MainPageTabContent mainPageTabContentPage = new MainPageTabContent();
    private PopUpCheckoutPage popUpCheckoutPage = new PopUpCheckoutPage();
    @BeforeAll
    public static void beforeSession() {
        openUrl(websiteURL);
    }

    @Test
    public void checkProductListElementSize() {
        Assertions.assertEquals(7, mainPageTabContentPage.getProductListPriceElementsList().size());
    }

    @Test
    public void clickAddToCartButtonAndCheckPriceOfElements() {
/*
        mainPageTabContentPage.zróbCośTam();
        mainPageTabContentPage.poTymZróbCośInnego();

        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(mainPageTabContentPage.getProductListPriceElement(1).getText()).isEqualTo(popUpCheckoutPage.getCartProductInfoOfTheProduct().get(3).getText());
        softAssert.assertThat(productNameView).isEqualTo(productNamePopup);
        softAssert.assertAll();


*/

        Wait wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);

        if(popUpCheckoutPage.getEmptyCartTextDisplay().isDisplayed()) {

            float totalProductsPrice = 0;

            totalProductsPrice += Float.parseFloat(mainPageTabContentPage.getProductListPriceElement(0).getText().replace("$",""));
            String productNameView = mainPageTabContentPage.getNameOfProductElement(1).getAttribute("title");
            mainPageTabContentPage.scrollToProductElementAndHoverMouseOnIt(1);
//            tabContentPage.takeElementsValueAndClickOnAddToCartAction(wait, 0);
            mainPageTabContentPage.clickOnAddToCart(1);
            String productNamePopup = popUpCheckoutPage.getCartProductName();
            SoftAssertions softAssert = new SoftAssertions();
            softAssert.assertThat(mainPageTabContentPage.getProductListPriceElement(1).getText()).isEqualTo(popUpCheckoutPage.getCartProductInfoOfTheProduct().get(3).getText());
            softAssert.assertThat(productNameView).isEqualTo(productNamePopup);
            softAssert.assertAll();

            popUpCheckoutPage.getContinueShoppingElement().click();

        }
    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}