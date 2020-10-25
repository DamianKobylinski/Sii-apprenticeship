import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BannerBasePage;
import pages.ContactUsPage;
import pages.MainPageTabContent;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

public class TestStepDef {
    //  Pages
    BannerBasePage bannerBasePage = new BannerBasePage();
    ContactUsPage contactUsPage = new ContactUsPage();
    MainPageTabContent mainPageTabContent = new MainPageTabContent();
    //  TestPages
    ContactUsPageTest contactUsPageTest = new ContactUsPageTest();
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
    public void afterSession() { quitDriver(); }

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

    @When("Enter the Contact Us Site")
    public void enterTheContactUsSite() {
        bannerBasePage.clickContactUsButton();
    }

    @Then("^Check ([^\"]*) Validation Element$")
    public void checkFormElementValidationElement(String validationElement) {
        switch (validationElement)
        {
            case "subjectHeading":
                contactUsPageTest.checkSubjectHeadingElementValue();
                break;
            case "emailAddress":
                contactUsPage.setEmailInputElement("damian@o2.com");
                contactUsPage.clickSubmitMessageButton();
                contactUsPageTest.alertWarningIsDisplayed();
                break;
            case "orderReference":
                contactUsPage.setOrderReference("rwgqrqbqe");
                contactUsPageTest.isOrderReferenceSet();
                break;
        }
    }
}
