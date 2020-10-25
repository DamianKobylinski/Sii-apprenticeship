package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static pages.BasePage.getDriver;

public class ContactUsPage {

    @FindBy(css = "#id_contact")
    private Select subjectHeadingElement;

    @FindBy(css = "#email")
    private WebElement emailInputElement;

    @FindBy(css = "#submitMessage")
    private WebElement submitMessageButton;

    @FindBy(css = ".alert")
    private WebElement alertWarning;

    @FindBy(css = "#id_order")
    private WebElement orderReference;

    public ContactUsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setSubjectHeadingElement(int optionIndex) {
        subjectHeadingElement.selectByIndex(optionIndex);
    }

    public Select getSubjectHeadingElement() {
        return subjectHeadingElement;
    }

    public void setEmailInputElement(String inputDate) {
        emailInputElement.sendKeys(inputDate);
    }

    public void clickSubmitMessageButton() {
        submitMessageButton.click();
    }

    public WebElement getAlertWarning() {
        return alertWarning;
    }

    public void setOrderReference(String order)
    {
        orderReference.sendKeys(order);
    }

    public String getOrderReference()
    {
        return orderReference.getText();
    }
}
