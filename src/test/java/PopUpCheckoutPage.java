import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pages.BasePage.getDriver;

public class PopUpCheckoutPage {

    @FindBy(css = ".button-container .button-medium")
    private static WebElement checkoutButtonProductElement;

    public PopUpCheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getCheckoutButtonProductElements() {
        return checkoutButtonProductElement;
    }
}
