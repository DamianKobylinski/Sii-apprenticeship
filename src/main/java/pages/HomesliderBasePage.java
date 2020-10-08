package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomesliderBasePage extends BasePage {

    @FindBy(css = ".homeslider-container")
    private List<WebElement> homeslidersLiHomesliderElement;

    @FindBy(css = "#htmlcontent_top ul li")
    private List<WebElement> homeslidersTopLiHomesliderElement;

    public HomesliderBasePage() {
        PageFactory.initElements(getDriver(),this);
    }

    public int getHomeslidersLiElementSize()
    {
        return homeslidersLiHomesliderElement.size();
    }
    public int getHomeslidersTopLiElementSize()
    {
        return homeslidersTopLiHomesliderElement.size();
    }
}
