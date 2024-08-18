package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignupPage {

    private AppiumDriver <MobileElement> driver;

    public SignupPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // locators:

    @AndroidFindBy(id = "com.rentfly.app:id/createAccountTitleText")
    @iOSXCUITFindBy(accessibility = "create_account_title_text")
    private MobileElement createAccountTitleText;

    @AndroidFindBy(id = "com.rentfly.app:id/firstNameInput")
    @iOSXCUITFindBy(accessibility = "first_name_input")
    private MobileElement firstNameInput;

    @AndroidFindBy(id = "com.rentfly.app:id/lastNameInput")
    @iOSXCUITFindBy(accessibility = "last_name_input")
    private MobileElement lastNameInput;

    @AndroidFindBy(id = "com.rentfly.app:id/emailInput")
    @iOSXCUITFindBy(accessibility = "email_input")
    private MobileElement emailInput;

    @AndroidFindBy(id = "com.rentfly.app:id/passwordInput")
    @iOSXCUITFindBy(accessibility = "password_input")
    private MobileElement passwordInput;

    @AndroidFindBy(id = "com.rentfly.app:id/phoneInput")
    @iOSXCUITFindBy(accessibility = "phone_input")
    private MobileElement phoneInput;

    @AndroidFindBy(id = "com.rentfly.app:id/signUpButton")
    @iOSXCUITFindBy(accessibility = "sign_up_button")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "com.rentfly.app:id/privacyPolicyLink")
    @iOSXCUITFindBy(accessibility = "privacy_policy_link")
    private MobileElement privacyPolicyLink;

    @AndroidFindBy(id = "com.rentfly.app:id/termsOfServicesLink")
    @iOSXCUITFindBy(accessibility = "terms_of_services_link")
    private MobileElement termsOfServicesLink;

    @AndroidFindBy(id = "com.rentfly.app:id/alreadyHaveAccountButton")
    @iOSXCUITFindBy(accessibility = "already_have_an_account_button")
    private MobileElement alreadyHaveAccountButton;

    // New locator for error messages
    @AndroidFindBy(id = "com.rentfly.app:id/errorMessageText")
    @iOSXCUITFindBy(accessibility = "error_message_text")
    private MobileElement errorMessageText;

    // error message:

    public String getErrorMessage() {
        return errorMessageText.getText();
    }

    // functions:

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void enterPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickPrivacyPolicyLink() {
        privacyPolicyLink.click();
    }

    public void clickTermsOfServicesLink() {
        termsOfServicesLink.click();
    }

    public void clickAlreadyHaveAccountButton() {
        alreadyHaveAccountButton.click();
    }

    public String getCreateAccountTitleText() {
        return createAccountTitleText.getText();
    }

    public void verifyFirstNameFieldIsVisible() {
        firstNameInput.isDisplayed();
    }

    public void verifyLastNameFieldIsVisible() {
        lastNameInput.isDisplayed();
    }

    public void verifyEmailFieldIsVisible() {
        emailInput.isDisplayed();
    }

    public void verifyPasswordFieldIsVisible() {
        passwordInput.isDisplayed();
    }

    public void verifyPhoneFieldIsVisible() {
        phoneInput.isDisplayed();
    }
}

