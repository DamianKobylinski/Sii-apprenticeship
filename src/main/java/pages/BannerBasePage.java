package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannerBasePage extends BasePage {
    @FindBy(xpath = "//nav/span/strong")
    private WebElement numberElement;

    public BannerBasePage() {
        PageFactory.initElements(getDriver(),this);
    }
    public String getBannerText()
    {
        return numberElement.getText();
    }
}
