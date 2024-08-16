package stepDefinitions;

import io.cucumber.java.en.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import utilities.driverManager;
import pages.*;

public class SignupSteps {

    private SignupPage signupPage;
    private TermsOfServicesPage termsOfServicePage;
    private PrivacyPolicyPage privacyPolicyPage;
    private LoginPage loginPage;

    AppiumDriver<MobileElement> driver = driverManager.driver;

    @Then("observe {string} signup area")
    public void observeSignupArea(String area) {
        signupPage = new SignupPage(driver);
        switch (area) {
            case "First Name":
                signupPage.verifyFirstNameFieldIsVisible();
                break;
            case "Last Name":
                signupPage.verifyLastNameFieldIsVisible();
                break;
            case "Email":
                signupPage.verifyEmailFieldIsVisible();
                break;
            case "Password":
                signupPage.verifyPasswordFieldIsVisible();
                break;
            case "Phone":
                signupPage.verifyPhoneFieldIsVisible();
                break;
        }
    }

    @When("click {string} link on signup page")
    public void clickLinkOnSignupPage(String link) {
        signupPage = new SignupPage(driver);
        switch (link) {
            case "Privacy Policy":
                signupPage.clickPrivacyPolicyLink();
                break;
            case "Terms of Service":
                signupPage.clickTermsOfServicesLink();
                break;
        }
    }

    @Then("observe the {string} title")
    public void observeTitle(String title) {
        switch (title) {
            case "Terms of Service":
                termsOfServicePage = new TermsOfServicesPage(driver);
                termsOfServicePage.verifyTitleIsVisible();
                break;
            case "Privacy Policy":
                privacyPolicyPage = new PrivacyPolicyPage(driver);
                privacyPolicyPage.verifyTitleIsVisible();
                break;
            case "Login With Email":
                loginPage = new LoginPage(driver);
                loginPage.verifyTitleIsVisible();
                break;
        }
    }

    @When("click {string} button on signup page")
    public void clickButtonOnSignupPage(String button) {
        signupPage = new SignupPage(driver);
        switch (button) {
            case "Sign Up":
                signupPage.clickSignUpButton();
                break;
            case "Already have an account?":
                signupPage.clickAlreadyHaveAccountButton();
                break;
        }
    }

    @Then("enter {string} info")
    public void enterInfo(String info) {
        signupPage = new SignupPage(driver);
        if (info.startsWith("First Name")) {
            signupPage.enterFirstName(info.split(":")[1].trim());
        } else if (info.startsWith("Last Name")) {
            signupPage.enterLastName(info.split(":")[1].trim());
        } else if (info.startsWith("Email")) {
            signupPage.enterEmail(info.split(":")[1].trim());
        } else if (info.startsWith("Password")) {
            signupPage.enterPassword(info.split(":")[1].trim());
        } else if (info.startsWith("Phone")) {
            signupPage.enterPhone(info.split(":")[1].trim());
        }
    }

    @Then("click {string} button on Privacy Policy page")
    public void acceptAgreement (String button) {
        privacyPolicyPage = new PrivacyPolicyPage(driver);
        termsOfServicePage = new TermsOfServicesPage(driver);
        switch (button) {
            case "Sign Up":
                privacyPolicyPage.clickAcceptButton();
                break;
            case "Already have an account?":
                termsOfServicePage.clickAcceptButton();
                break;
        }
    }

    @And("see the {string} message for signup")
    public void seeTheMessageForSignup(String message) {
        signupPage = new SignupPage(driver);
        String actualMessage = signupPage.getErrorMessage();
        if (!actualMessage.contains(message)) {
            throw new AssertionError("Expected message: " + message + " but got: " + actualMessage);
        }
    }

}

