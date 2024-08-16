package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class AccountTypePage {

    private AppiumDriver <MobileElement> driver;
    public AccountTypePage (AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.rentfly.app:id/chooseAccountTypeText")
    @iOSXCUITFindBy(accessibility = "choose_account_type_text")
    private MobileElement chooseAccountTypeText;

    @AndroidFindBy(id = "com.rentfly.app:id/personalButton")
    @iOSXCUITFindBy(accessibility = "personal_button")
    private MobileElement personalButton;

    @AndroidFindBy(id = "com.rentfly.app:id/companyButton")
    @iOSXCUITFindBy(accessibility = "company_button")
    private MobileElement companyButton;

    // Methods
    public void clickPersonalButton() {
        personalButton.click();
    }

    public void clickCompanyButton() {
        companyButton.click();
    }

    /*
    public String getChooseAccountTypeText() {
        return chooseAccountTypeText.getText();
    }

    */
    public String getPersonalButtonText() {
        return personalButton.getText();
    }
    public String getCompanyButtonText() {
        return companyButton.getText();
    }
}

