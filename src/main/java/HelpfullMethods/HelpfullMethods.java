package HelpfullMethods;

import pages.BasePage;

public class HelpfullMethods {

    public static void openUrl(String urlAddress) {
        BasePage.getDriver().get(urlAddress);
    }

}
