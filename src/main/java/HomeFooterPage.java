import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeFooterPage extends PageObject {

    @FindBy(css = "#htmlcontent_home ul li a")
    private List<WebElement> listOfHtmlContentElement;

    @FindBy(css = "#cmsinfo_block div ul li div p a")
    private WebElement seleniumFrameworkButtonElement;

    public HomeFooterPage(WebDriver driver) {
        super(driver);
    }
    public String getSeleniumFrameworkButtonElementAttribute()
    {
        return seleniumFrameworkButtonElement.getAttribute("href");
    }
    public List<WebElement> getListOfHtmlContentElement()
    {
        return listOfHtmlContentElement;
    }
}
