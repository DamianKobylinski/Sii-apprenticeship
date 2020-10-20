package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPageTabContent extends BasePage {
    private PopUpCheckoutPage popUpCheckoutPage = new PopUpCheckoutPage();

    final String BLOCKING_RIGHT_TAB_PRODUCTS_ELEMENTS_LOCATOR = "ul#homefeatured li div.right-block a[title='Add to cart']";
    final By blockingRightTabProduct_locator = By.cssSelector(BLOCKING_RIGHT_TAB_PRODUCTS_ELEMENTS_LOCATOR);
    // Locators
    @FindBy(css = ".right-block .content_price .price")
    private List<WebElement> productListPriceElement;

    @FindBy(css = ".right-block h5 a")
    private List<WebElement> productName;

    @FindBy(css = BLOCKING_RIGHT_TAB_PRODUCTS_ELEMENTS_LOCATOR)
    private List<WebElement> blockRightTabProductElements;

    @FindBy(css = "#homefeatured li")
    private List<WebElement> liInHomeFeaturedElements;

    //    Methods
    public MainPageTabContent() {
        PageFactory.initElements(getDriver(), this);
    }

    public List<WebElement> getProductListPriceElementsList() {
        return productListPriceElement;
    }

    public float getProductPrice(int productNumber) {
        return Float.parseFloat(productListPriceElement.get(productNumber).getText().replace("$",""));
    }

    public List<WebElement> getBlockRightTabProductElements() {
        return blockRightTabProductElements;
    }

    public String getProductName(int productNumber) {
        return productName.get(productNumber).getText();
    }

    public void lisElementAddHoveredClass(int productNumber) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].setAttribute('class','ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered');", liInHomeFeaturedElements.get(productNumber));
    }

    public void clickOnAddToCart(int productNumber) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(blockingRightTabProduct_locator, 1));
        blockRightTabProductElements.get(productNumber).click();
    }

    public void tabProductActions(int productNumber)
    {
        lisElementAddHoveredClass(0);
        clickOnAddToCart(0);

    }
}
