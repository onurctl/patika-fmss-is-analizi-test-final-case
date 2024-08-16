package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class PasswordResetPage {

    private AppiumDriver<MobileElement> driver;

    public PasswordResetPage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rentfly.app:id/resetPasswordTitleText")
    @iOSXCUITFindBy(accessibility = "reset_password_title_text")
    private MobileElement resetPasswordTitleText;

    @AndroidFindBy(id = "com.rentfly.app:id/emailInput")
    @iOSXCUITFindBy(accessibility = "email_input")
    private MobileElement emailInput;

    @AndroidFindBy(id = "com.rentfly.app:id/sendButton")
    @iOSXCUITFindBy(accessibility = "send_button")
    private MobileElement sendButton;

    @AndroidFindBy(id = "com.rentfly.app:id/resetPasswordMessage")
    @iOSXCUITFindBy(accessibility = "reset_password_message")
    private MobileElement resetPasswordMessage;

    // Methods

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    /*
    public void clickSendButton() {
        sendButton.click();
    }

    public String getResetPasswordTitleText() {
        return resetPasswordTitleText.getText();
    }
    */

    public void verifyEmailInputIsVisible() {
        emailInput.isDisplayed();
    }

    public String getDisplayedMessage() {
        return resetPasswordMessage.getText();
    }
}
