package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderBasePage extends BasePage {

    @FindBy(css = "#header_logo")
    private WebElement logoHeaderElement;

    @FindBy(css = "#searchbox")
    private WebElement formHeaderElement;

    @FindBy(xpath = "//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a")
    private List<WebElement> sfMenuElement;


    public HeaderBasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public boolean checkIfLogoHeaderElementIsDisplayed() {
        return logoHeaderElement.isDisplayed();
    }

    public String getFormHeaderElementAttribute() {
        return formHeaderElement.getAttribute("method");
    }
}
