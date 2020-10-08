package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavBarBasePage extends BasePage {

    @FindBy(css = ".banner")
    private WebElement navbarImageBanner;

    @FindBy(xpath = "//nav/div/a")
    private List<WebElement> divsAMenuTopNavElement;

    public NavBarBasePage() {
        PageFactory.initElements(getDriver(),this);
    }

    public boolean checkIfNavBarImageIsDisplayed()
    {
        return navbarImageBanner.isDisplayed();
    }
    public List<WebElement> getNavBarMenuElements()
    {
        return divsAMenuTopNavElement;
    }
}
