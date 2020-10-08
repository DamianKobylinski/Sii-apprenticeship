import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderPage extends PageObject {

    @FindBy(css = "#header_logo")
    private WebElement logoHeaderElement;

    @FindBy(css = "#searchbox")
    private WebElement formHeaderElement;

    @FindBy(xpath = "//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a")
    private List<WebElement> sfMenuElement;


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfLogoHeaderElementIsDisplayed()
    {
        return logoHeaderElement.isDisplayed();
    }

    public String getFormHeaderElementAttribute()
    {
        return formHeaderElement.getAttribute("method");
    }
}
