package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    private static WebDriver driver;

//    public pages.BasePage(WebDriver driver)
//    {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

//    public static void getWebsiteURL()
//    {
//        driver.get(websiteURL);
//    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver=null;
    }
}
