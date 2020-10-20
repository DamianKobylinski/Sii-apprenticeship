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
//            System.setProperty("webdriver.gecko.driver","C:\\projekty\\frameworki\\Praktyki\\DamianSii-apprenticeship\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver=null;
    }
}
