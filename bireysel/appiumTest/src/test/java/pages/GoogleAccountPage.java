package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GoogleAccountPage {

    private AppiumDriver <MobileElement> driver;

    public GoogleAccountPage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // locators:

    @AndroidFindBy(id = "com.rentfly.app:id/googleSignUpText")
    @iOSXCUITFindBy(accessibility = "google_sign_up_text")
    private MobileElement googleSignUpText;

    @AndroidFindBy(id = "com.rentfly.app:id/emailInput")
    @iOSXCUITFindBy(accessibility = "email_input")
    private MobileElement emailInput;

    @AndroidFindBy(id = "com.rentfly.app:id/nextButton")
    @iOSXCUITFindBy(accessibility = "next_button")
    private MobileElement nextButton;

    // functions:

    /*
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clickNextButton() {
        nextButton.click();
    }
    */

    public String getGoogleSignUpText() {
        return googleSignUpText.getText();
    }
}
