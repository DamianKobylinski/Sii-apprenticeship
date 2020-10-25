import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Select;
import pages.ContactUsPage;

import static HelpfullMethods.HelpfullMethods.openUrl;
import static pages.BasePage.quitDriver;

public class ContactUsPageTest {

    static ContactUsPage contactUsPage = new ContactUsPage();

    @BeforeAll
    public static void beforeSession() {
        openUrl(InitiationTestClass.contactUsURL);
    }

    @Test
    public void checkSubjectHeadingElementValue()
    {
        contactUsPage.setSubjectHeadingElement(1);
        Select foo = contactUsPage.getSubjectHeadingElement();
//        Assertions.assertNotEquals(,"0");
    }

    @Test
    public void alertWarningIsDisplayed()
    {
        Assertions.assertTrue(contactUsPage.getAlertWarning().isDisplayed());
    }

    @Test
    public void isOrderReferenceSet()
    {
        Assertions.assertNotEquals("",contactUsPage.getOrderReference());
    }
    @AfterAll
    public static void afterSession() {
        quitDriver();
    }
}
