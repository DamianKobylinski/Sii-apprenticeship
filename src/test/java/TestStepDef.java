import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BannerBasePage;
import pages.MainPageTabContent;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

public class TestStepDef{

    BannerBasePage bannerBasePage = new BannerBasePage();
    MainPageTabContent mainPageTabContent = new MainPageTabContent();
    MainPageTabContentPageTest mainPageTabContentPageTest = new MainPageTabContentPageTest();

    @Given("User open the home page")
    public void userOpenTheHomePage() {
        openUrl(InitiationTestClass.websiteURL);
    }

    @When("Phone number Element from Banner")
    public void phoneNumberElementFromBanner() {
        bannerBasePage.getBannerText();
    }

    @Then("Check if phone number is correct")
    public void checkIfPhoneNumberIsCorrect() {
        BannerPageTest.getTextFromBanner();
    }
    @After
    public void afterSession(){
        quitDriver();
    }

    @When("Hover on the product")
    public void hoverOnTheProduct() {
        mainPageTabContent.lisElementAddHoveredClass(0);
    }

    @And("Click Add to Cart button")
    public void clickAddToCartButton() {
        mainPageTabContent.clickOnAddToCart(0);
    }

    @Then("Check the Name of the Product")
    public void checkTheNameOfTheProduct() {
        mainPageTabContentPageTest.checkNameOfBuyingProduct();
    }

    @And("Check price Value of the Product")
    public void checkPriceValueOfTheProduct() {
        mainPageTabContentPageTest.checkPriceValueOfBuyingProduct();
    }

    @When("^Hover on the product number ([^\"]*)$")
    public void hoverOnTheProductNumber(String number) {
        mainPageTabContent.lisElementAddHoveredClass((int) Float.parseFloat(number));
    }

    @And("^Click ([^\"]*) Add to Cart button$")
    public void clickProductNumberAddToCartButton(String number) {
        mainPageTabContent.clickOnAddToCart((int) Float.parseFloat(number));
    }
}
