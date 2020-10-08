import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterPage extends PageObject{

    @FindBy(css = "#block_various_links_footer ul li")
    private List<WebElement> listOfNavigatorsElement;

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfNavigatorsElement()
    {
        return listOfNavigatorsElement;
    }
}
