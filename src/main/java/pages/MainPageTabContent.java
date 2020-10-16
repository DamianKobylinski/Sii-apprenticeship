package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.function.Function;

public class MainPageTabContent extends BasePage {

    final String BLOCKING_RIGHT_TAB_PRODUCTS_ELEMENTS_LOCATOR = "ul#homefeatured li div.right-block a[title='Add to cart']";
    final By blockingRightTabProduct_locator = By.cssSelector(BLOCKING_RIGHT_TAB_PRODUCTS_ELEMENTS_LOCATOR);
    // Locators
    @FindBy(css = ".right-block .content_price .price")
    private List<WebElement> productListPriceElement;

    @FindBy(css = ".right-block h5 a")
    private List<WebElement> takeNamesOfProductsElements;

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
//        checkOut.click();
    }

    public void clickOnAddToCart(int productNumber) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(blockingRightTabProduct_locator, 1));
        blockRightTabProductElements.get(productNumber).click();
//        TODO dodaj czekanie na wyświetlenie całego popupa
    }
/*
    public void zróbCośTam(){
        pobierzList();
        wybierzElemtn(1);
        asdasd();
        xcvxcv();
    }

    private void pobierzList() {
    }
*/
}
