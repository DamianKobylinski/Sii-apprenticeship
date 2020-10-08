package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabContentBasePage extends BasePage {

    @FindBy(css = "#homefeatured li")
    private List<WebElement> productListElement;

    @FindBy(css = ".content_price .price")
    private List<WebElement> productListPriceElement;

    public TabContentBasePage() {
        PageFactory.initElements(getDriver(),this);
    }

    public List<WebElement> getProductListElement()
    {
        return productListElement;
    }
    public List<WebElement> getProductListPriceElement()
    {
        return productListElement;
    }
}
