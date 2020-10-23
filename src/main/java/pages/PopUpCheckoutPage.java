package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static pages.BasePage.getDriver;

public class PopUpCheckoutPage {

    final String CART_PRODUCT_NAME = ".layer_cart_product_info span";
    final By cartProductElement_Locator = By.cssSelector(CART_PRODUCT_NAME);

    @FindBy(css = CART_PRODUCT_NAME)
    private List<WebElement> cartProductInfoTitleOfTheProduct;
    //    ----------------TEST-------------------
    @FindBy(css = ".layer_cart_product_info #layer_cart_product_title")
    private WebElement cartProductNameElement;
    //    ----------------TEST-------------------
    @FindBy(css = ".button-container .button-medium")
    private static WebElement checkoutButtonElement;

    @FindBy(css = ".button-container .continue")
    private WebElement continueShoppingElement;

    @FindBy(css = ".ajax_cart_no_product")
    private WebElement emptyCartTextDisplay;

    @FindBy(css = ".ajax_block_products_total")
    private WebElement totalProductsPriceElement;

    public PopUpCheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickCheckoutButton() {
        checkoutButtonElement.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingElement.click();
    }

    public List<WebElement> getCartProductInfoOfTheProduct() {
        return cartProductInfoTitleOfTheProduct;
    }

    public WebElement getEmptyCartTextDisplay() {
        return emptyCartTextDisplay;
    }

    public WebElement getTotalProductsPrice() {
        return totalProductsPriceElement;
    }

    public WebElement getCartProductName() {
        return cartProductNameElement;
    }
}
