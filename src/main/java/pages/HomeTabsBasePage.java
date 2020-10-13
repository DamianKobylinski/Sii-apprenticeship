package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeTabsBasePage extends BasePage {

    @FindBy(css = "#home-page-tabs a")
    private List<WebElement> homepageTabsAElements;

    public HomeTabsBasePage() {
        PageFactory.initElements(getDriver(),this);
    }

    public List<WebElement> getHomePageTabsAElement() {
        return homepageTabsAElements;
    }
}
