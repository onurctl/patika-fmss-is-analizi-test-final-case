package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class LoginPage {

    private AppiumDriver <MobileElement> driver;
    public LoginPage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rentfly.app:id/loginTitleText")
    @iOSXCUITFindBy(accessibility = "login_title_text")
    private MobileElement loginTitleText;

    @AndroidFindBy(id = "com.rentfly.app:id/emailInput")
    @iOSXCUITFindBy(accessibility = "email_input")
    private MobileElement emailInput;

    @AndroidFindBy(id = "com.rentfly.app:id/passwordInput")
    @iOSXCUITFindBy(accessibility = "password_input")
    private MobileElement passwordInput;

    @AndroidFindBy(id = "com.rentfly.app:id/forgotPasswordLink")
    @iOSXCUITFindBy(accessibility = "forgot_password_link")
    private MobileElement forgotPasswordLink;

    @AndroidFindBy(id = "com.rentfly.app:id/loginButton")
    @iOSXCUITFindBy(accessibility = "login_button")
    private MobileElement loginButton;

    @AndroidFindBy(id = "com.rentfly.app:id/needAnAccountButton")
    @iOSXCUITFindBy(accessibility = "need_an_account_button")
    private MobileElement needAnAccountButton;

    @AndroidFindBy(id = "com.rentfly.app:id/continueWithGoogleButton")
    @iOSXCUITFindBy(accessibility = "continue_with_google_button")
    private MobileElement continueWithGoogleButton;

    // error message:

    @AndroidFindBy(id = "com.rentfly.app:id/errorMessageText")
    @iOSXCUITFindBy(accessibility = "error_message_text")
    private MobileElement errorMessageText;

    public String getErrorMessage() {
        return errorMessageText.getText();
    }

    // Methods

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickNeedAnAccountButton() {
        needAnAccountButton.click();
    }

    public void clickContinueWithGoogleButton() {
        continueWithGoogleButton.click();
    }

    public String getLoginTitleText() {
        return loginTitleText.getText();
    }

    public void verifyTitleIsVisible() {
        loginTitleText.isDisplayed();
    }

    public MobileElement getEmailInput() {
        return emailInput;
    }

    public MobileElement getPasswordInput() {
        return passwordInput;
    }

    public void verifyElementIsVisible(MobileElement element) {
        if (!element.isDisplayed()) {
            throw new AssertionError("Element is not visible");
        }
    }
}
