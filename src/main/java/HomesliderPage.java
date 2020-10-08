import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomesliderPage extends PageObject {

    @FindBy(css = ".homeslider-container")
    private List<WebElement> homeslidersLiHomesliderElement;

    @FindBy(css = "#htmlcontent_top ul li")
    private List<WebElement> homeslidersTopLiHomesliderElement;

    public HomesliderPage(WebDriver driver) {
        super(driver);
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
