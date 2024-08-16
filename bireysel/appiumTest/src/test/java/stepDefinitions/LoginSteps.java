package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import pages.*;
import utilities.driverManager;

public class LoginSteps {

    AppiumDriver<MobileElement> driver = driverManager.driver;

    private LoginPage loginPage;

    @Then("observe {string} login area")
    public void observeLoginArea(String area) {
        loginPage = new LoginPage(driver);
        if (area.equals("Email")) {
            loginPage.verifyElementIsVisible(loginPage.getEmailInput());
        } else if (area.equals("Password")) {
            loginPage.verifyElementIsVisible(loginPage.getPasswordInput());
        }
    }

    @When("click {string} link on Login page")
    public void clickLinkOnLoginPage(String link) {
        if (link.equals("Forgot Password?")) {
            loginPage.clickForgotPasswordLink();
        }
    }

    @When("click {string} button on Login page")
    public void clickButtonOnLoginPage(String button) {
        if (button.equals("Login")) {
            loginPage.clickLoginButton();
        } else if (button.equals("Need an account")) {
            loginPage.clickNeedAnAccountButton();
        } else if (button.equals("Continue with Google")) {
            loginPage.clickContinueWithGoogleButton();
        }
    }

    @Then("enter {string} info for login")
    public void enterInfoForLogin(String info) {
        String[] parts = info.split(":");
        String type = parts[0].trim();
        String value = parts[1].trim();

        if (type.equals("Email")) {
            loginPage.enterEmail(value);
        } else if (type.equals("Password")) {
            loginPage.enterPassword(value);
        }
    }

    @And("see the {string} message")
    public void seeTheMessage(String message) {
        String actualMessage = loginPage.getErrorMessage();
        if (!actualMessage.equals(message)) {
            throw new AssertionError("Expected message: " + message + ", but got: " + actualMessage);
        }
    }
}

