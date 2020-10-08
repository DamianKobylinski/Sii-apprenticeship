import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class InitiationTestClass {

    static final String websiteURL = "http://automationpractice.com/index.php";

    public static WebDriver createDriver()
    {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
