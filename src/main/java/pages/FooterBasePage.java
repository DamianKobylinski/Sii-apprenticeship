package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FooterBasePage extends BasePage {

    @FindBy(css = "#block_various_links_footer ul li")
    private List<WebElement> listOfNavigatorsElement;

    public FooterBasePage() {
        PageFactory.initElements(getDriver(),this);
    }

    public List<WebElement> getListOfNavigatorsElement() {
        return listOfNavigatorsElement;
    }
}
