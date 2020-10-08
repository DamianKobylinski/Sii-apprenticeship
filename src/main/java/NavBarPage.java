import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavBarPage extends PageObject{

    @FindBy(css = ".banner")
    private WebElement navbarImageBanner;

    @FindBy(xpath = "//nav/div/a")
    private List<WebElement> divsAMenuTopNavElement;

    public NavBarPage(WebDriver driver) {
        super(driver);
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
