import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TabContentPage extends PageObject{

    @FindBy(css = "#homefeatured li")
    private List<WebElement> productListElement;

    @FindBy(css = ".content_price .price")
    private List<WebElement> productListPriceElement;

    public TabContentPage(WebDriver driver) {
        super(driver);
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
