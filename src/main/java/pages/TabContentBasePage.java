package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.function.Function;

public class TabContentBasePage extends BasePage {
// Locators
    @FindBy(css = ".right-block .content_price .price")
    private List<WebElement> productListPriceElement;

    @FindBy(css = ".right-block h5 a")
    private List<WebElement> takeNamesOfProductsElements;

    @FindBy(css = ".ajax_block_product div .right-block .button-container .ajax_add_to_cart_button")
    private List<WebElement> blockRightTabProductElements;

    @FindBy(css = "#homefeatured li .product-container")
    private List<WebElement> liInHomeFeaturedElements;

//    Methods
    public TabContentBasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public List<WebElement> getProductListPriceElementsList() {
        return productListPriceElement;
    }

    public WebElement getProductListPriceElement(int value) {
        return productListPriceElement.get(value);
    }

    public List<WebElement> getBlockRightTabProductElements() {
        return blockRightTabProductElements;
    }

    public void scrollToProductElementAndHoverMouseOnIt(int value) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", liInHomeFeaturedElements.get(value));
        Actions action = new Actions(getDriver());
        action.moveToElement(liInHomeFeaturedElements.get(value)).perform();
    }

    public WebElement getNameOfProductElement(int value) {
        return takeNamesOfProductsElements.get(value);
    }

    public void takeElementsValueAndClickOnAddToCartAction(Wait waitForPopUp, int value) {
        WebElement checkOut = (WebElement) waitForPopUp.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                List<WebElement> addToCartButtons = getBlockRightTabProductElements();
                return addToCartButtons.get(value);
            }
        });
        checkOut.click();
    }
}
