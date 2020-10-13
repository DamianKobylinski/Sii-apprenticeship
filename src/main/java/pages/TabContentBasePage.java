package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabContentBasePage extends BasePage {

    @FindBy(css = "#homefeatured li")
    private List<WebElement> productListElement;

    @FindBy(css = ".content_price .price")
    private List<WebElement> productListPriceElement;

    @FindBy(css = ".ajax_block_product div .right-block .button-container .ajax_add_to_cart_button")
    private List<WebElement> blockRightTabProductElements;

    @FindBy(css = "#homefeatured li .product-container")
    private List<WebElement> liInHomeFeaturedElements;

    public TabContentBasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public List<WebElement> getProductListElement() {
        return productListElement;
    }

    public List<WebElement> getProductListPriceElement() {
        return productListElement;
    }

    public List<WebElement> getBlockRightTabProductElements() {
        return blockRightTabProductElements;
    }

    public void buttonContainerElement() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", liInHomeFeaturedElements.get(0));
        Actions action = new Actions(getDriver());
        action.moveToElement(liInHomeFeaturedElements.get(0)).perform();
    }
}
