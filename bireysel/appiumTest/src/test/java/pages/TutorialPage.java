package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TutorialPage {

    private AppiumDriver<MobileElement> driver;

    public TutorialPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // First tutorial page locators

    @AndroidFindBy(id = "com.rentfly.app:id/tutorialTitle")
    @iOSXCUITFindBy(accessibility = "tutorial_title")
    private MobileElement titleText;

    @AndroidFindBy(id = "com.rentfly.app:id/skipButton")
    @iOSXCUITFindBy(accessibility = "skip_button")
    private MobileElement skipButton;

    @AndroidFindBy(id = "com.rentfly.app:id/startButton")
    @iOSXCUITFindBy(accessibility = "start_button")
    private MobileElement startButton;

    // Methods

    public void clickSkipButton() {
        skipButton.click();
    }

    public void clickStartButton() {
        startButton.click();
    }

    public String getTitleText() {
        return titleText.getText();
    }



}


