package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeFooterBasePage extends BasePage {

    @FindBy(css = "#htmlcontent_home ul li a")
    private List<WebElement> listOfHtmlContentElement;

    @FindBy(css = "#cmsinfo_block div ul li div p a")
    private WebElement seleniumFrameworkButtonElement;

    public HomeFooterBasePage() {

        PageFactory.initElements(getDriver(),this);
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
