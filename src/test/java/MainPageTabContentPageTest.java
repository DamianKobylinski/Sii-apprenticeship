import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.MainPageTabContent;
import pages.PopUpCheckoutPage;

import static HelpfullMethods.HelpfullMethods.openUrl;
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
    public void addToCartAction() {
        float totalProductsPrice = 0;


        totalProductsPrice += mainPageTabContentPage.getProductPrice(0);
        mainPageTabContentPage.tabProductActions(0);
        Assertions.assertEquals(mainPageTabContentPage.getProductName(0),popUpCheckoutPage.getCartProductName());
        Assertions.assertEquals(totalProductsPrice, popUpCheckoutPage.getTotalProductsPrice());
        popUpCheckoutPage.clickContinueShoppingButton();

    }

    @AfterAll
    public static void afterSession() {
        quitDriver();
    }

}