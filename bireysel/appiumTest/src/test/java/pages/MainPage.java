package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class MainPage {

    private AppiumDriver <MobileElement> driver;
    public MainPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rentfly.app:id/appNameText")
    @iOSXCUITFindBy(accessibility = "app_name_text")
    private MobileElement appNameText;

    @AndroidFindBy(id = "com.rentfly.app:id/sloganText")
    @iOSXCUITFindBy(accessibility = "slogan_text")
    private MobileElement sloganText;

    @AndroidFindBy(id = "com.rentfly.app:id/continueWithGoogleButton")
    @iOSXCUITFindBy(accessibility = "continue_with_google_button")
    private MobileElement continueWithGoogleButton;

    @AndroidFindBy(id = "com.rentfly.app:id/signUpWithEmailButton")
    @iOSXCUITFindBy(accessibility = "sign_up_with_email_button")
    private MobileElement signUpWithEmailButton;

    @AndroidFindBy(id = "com.rentfly.app:id/alreadyHaveAccountLink")
    @iOSXCUITFindBy(accessibility = "already_have_an_account_link")
    private MobileElement alreadyHaveAccountLink;

    @AndroidFindBy(id = "com.rentfly.app:id/privacyPolicyLink")
    @iOSXCUITFindBy(accessibility = "privacy_policy_link")
    private MobileElement privacyPolicyLink;

    @AndroidFindBy(id = "com.rentfly.app:id/termsOfServicesLink")
    @iOSXCUITFindBy(accessibility = "terms_of_services_link")
    private MobileElement termsOfServicesLink;

    // Methods

    public void clickContinueWithGoogle() {
        continueWithGoogleButton.click();
    }

    public void clickSignUpWithEmail() {
        signUpWithEmailButton.click();
    }

    public void clickPrivacyPolicyLink() {
        privacyPolicyLink.click();
    }

    public void clickTermsOfServicesLink() {
        termsOfServicesLink.click();
    }

    public String getAppNameText() {
        return appNameText.getText();
    }

    public String getSloganText() {
        return sloganText.getText();
    }

    public void clickAlreadyHaveAccountLink() {
        alreadyHaveAccountLink.click();
    }

}

