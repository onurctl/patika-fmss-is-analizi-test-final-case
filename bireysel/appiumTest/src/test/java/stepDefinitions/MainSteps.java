package stepDefinitions;

import io.cucumber.java.en.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import utilities.driverManager;
import pages.*;

public class MainSteps {

        private MainPage mainPage;
        private PrivacyPolicyPage privacyPolicyPage;
        private TermsOfServicesPage termsOfServicesPage;
        private SignupPage signUpPage;
        private AccountTypePage accountTypePage;
        private GoogleAccountPage googleAccountPage;
        private LoginPage loginPage;

        AppiumDriver<MobileElement> driver = driverManager.driver;

        @Then("User on Main page")
        public void userOnMainPage() {
                mainPage = new MainPage(driver);
        }

        @And("click {string} button")
        public void clickButton(String buttonName) {
                switch (buttonName) {
                        case "Continue with Google":
                                mainPage.clickContinueWithGoogle();
                                break;
                        case "Sign Up with Email":
                                mainPage.clickSignUpWithEmail();
                                break;
                }
        }

        @Then("observe the {string} title")
        public void observeTheTitle(String title) {
                switch (title) {
                        case "Rent and Drive Like You Fly":
                                assert mainPage.getSloganText().equals(title);
                                break;
                        case "Privacy Policy":
                                privacyPolicyPage = new PrivacyPolicyPage(driver);
                                assert privacyPolicyPage.getPrivacyPolicyText().equals(title);
                                break;
                        case "Terms of Service":
                                termsOfServicesPage = new TermsOfServicesPage(driver);
                                assert termsOfServicesPage.getTermsOfServicesText().equals(title);
                                break;
                        case "Use a Google account to sign up and log in.":
                                googleAccountPage = new GoogleAccountPage(driver);
                                assert googleAccountPage.getGoogleSignUpText().equals(title);
                                break;
                        case "Create An Account":
                                signUpPage = new SignupPage(driver);
                                assert signUpPage.getCreateAccountTitleText().equals(title);
                                break;
                        case "Login With Email":
                                loginPage = new LoginPage(driver);
                                assert loginPage.getLoginTitleText().equals(title);
                                break;
                }
        }

        @When("click {string} link")
        public void clickLink(String linkText) {
                switch (linkText) {
                        case "Privacy Policy":
                                mainPage.clickPrivacyPolicyLink();
                                break;
                        case "Terms of Service":
                                mainPage.clickTermsOfServicesLink();
                                break;
                        case "Already have an account?":
                                mainPage.clickAlreadyHaveAccountLink();
                                break;
                }
        }

        @Then("observe {string} button")
        public void observeButton(String buttonName) {
                accountTypePage = new AccountTypePage(driver);
                switch (buttonName) {
                        case "Personal":
                                assert accountTypePage.getPersonalButtonText().equals(buttonName);
                                break;
                        case "Company":
                                assert accountTypePage.getCompanyButtonText().equals(buttonName);
                                break;
                }
        }

        @And("choose {string} option on Account Type page")
        public void chooseOptionOnAccountTypePage(String option) {
                accountTypePage = new AccountTypePage(driver);
                switch (option) {
                        case "Personal":
                                accountTypePage.clickPersonalButton();
                                break;
                        case "Company":
                                accountTypePage.clickCompanyButton();
                                break;
                }
        }
}

