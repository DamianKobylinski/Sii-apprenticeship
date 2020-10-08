import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomeTabsPage extends PageObject {

    @FindBy(css = "#home-page-tabs a")
    private List<WebElement> homepageTabsAElements;

    public HomeTabsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getHomePageTabsAElement()
    {
        return homepageTabsAElements;
    }
}
