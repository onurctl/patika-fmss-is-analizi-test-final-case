package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PrivacyPolicyPage {

    private AppiumDriver <MobileElement> driver;

    public PrivacyPolicyPage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.rentfly.app:id/privacyPolicyText")
    @iOSXCUITFindBy(accessibility = "privacy_policy_text")
    private MobileElement privacyPolicyText;

    @AndroidFindBy(id = "com.rentfly.app:id/acceptButton")
    @iOSXCUITFindBy(accessibility = "accept_button")
    private MobileElement acceptButton;

    // Methods

    public String getPrivacyPolicyText() {
        return privacyPolicyText.getText();
    }

    public void clickAcceptButton() {
        acceptButton.click();
    }

    public void verifyTitleIsVisible() {
        privacyPolicyText.isDisplayed();
    }

}
