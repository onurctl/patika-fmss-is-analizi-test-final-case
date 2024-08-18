package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialSecondPage {

    private AppiumDriver<MobileElement> driver;

    public TutorialSecondPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // second tutorial page locators:

    @AndroidFindBy(id = "com.rentfly.app:id/tutorialTitle2")
    @iOSXCUITFindBy(accessibility = "tutorial_title_2")
    private MobileElement titleTextSecondPage;

    @AndroidFindBy(id = "com.rentfly.app:id/skipButton2")
    @iOSXCUITFindBy(accessibility = "skip_button_2")
    private MobileElement skipButtonSecondPage;

    // functions:

    public String getTitleTextSecondPage() {
        return titleTextSecondPage.getText();
    }

    public void clickSkipButton() {
        skipButtonSecondPage.click();
    }

}

