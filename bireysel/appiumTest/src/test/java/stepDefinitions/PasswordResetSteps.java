package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import pages.*;
import utilities.driverManager;

public class PasswordResetSteps {

    AppiumDriver<MobileElement> driver = driverManager.driver;

    private PasswordResetPage passwordResetPage;

    public PasswordResetSteps() {
        passwordResetPage = new PasswordResetPage(driver);
    }

    @Then("observe {string} password reset area")
    public void observePasswordResetArea(String input) {
        if (input.equals("Email")) {
            passwordResetPage.verifyEmailInputIsVisible();
        }
    }

    @Then("enter reset {string} info")
    public void enterResetInfo(String email) {
        passwordResetPage.enterEmail(email);
    }

    @And("see the {string} message for reset")
    public void seeTheMessageForReset(String message) {
        String displayedMessage = passwordResetPage.getDisplayedMessage();
        assert(displayedMessage.contains(message));
    }


}
