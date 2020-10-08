import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BannerPage extends PageObject{
    @FindBy(xpath = "//nav/span/strong")
    private WebElement numberElement;

    public BannerPage(WebDriver driver) {
        super(driver);
    }
    public String getBannerText()
    {
        return numberElement.getText();
    }
}
