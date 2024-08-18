package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TermsOfServicesPage {

    private AppiumDriver <MobileElement> driver;

    public TermsOfServicesPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // locators:
    
    @AndroidFindBy(id = "com.rentfly.app:id/termsOfServicesText")
    @iOSXCUITFindBy(accessibility = "terms_of_services_text")
    private MobileElement termsOfServicesText;

    @AndroidFindBy(id = "com.rentfly.app:id/acceptButton")
    @iOSXCUITFindBy(accessibility = "accept_button")
    private MobileElement acceptButton;

    // functions:

    public String getTermsOfServicesText() {
        return termsOfServicesText.getText();
    }

    public void clickAcceptButton() {
        acceptButton.click();
    }

    public void verifyTitleIsVisible() {
        termsOfServicesText.isDisplayed();
    }

}
