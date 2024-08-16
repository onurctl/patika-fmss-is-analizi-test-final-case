package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import pages.*;
import pages.TutorialPage;
import pages.TutorialSecondPage;
import utilities.driverManager;

public class TutorialSteps {

    int isSecondPage = 0;
    private TutorialPage tutorialPage;
    private TutorialSecondPage tutorialPage2;
    private MainPage mainPage;

    AppiumDriver<MobileElement> driver = driverManager.driver;  // Hooks'da başlatılan driver'ı alarak

    @Given("User on Tutorial page")
    public void userOnTutorialPage() {
        tutorialPage = new TutorialPage(driver);
    }

    @Then("observe the {string} text")
    public void observeTheText(String text) {
        switch (text) {
            case "Let's take a tour about RENTfy!":
                assert tutorialPage.getTitleText().equals(text);
            case "RENTfly offers you a fast and easy car rental experience thanks to its innovative approaches.":
                tutorialPage2 = new TutorialSecondPage(driver);
                assert tutorialPage2.getTitleTextSecondPage().equals(text);
                break;
        }
    }

    @And("click {string} button on tutorial page")
    public void clickButtonOnTutorialPage(String button) {
        switch (button) {
            case "Start":
                tutorialPage.clickStartButton();
                isSecondPage++;
                break;
            case "Skip Tour":
                if (isSecondPage==1){
                    tutorialPage2 = new TutorialSecondPage(driver);
                    tutorialPage2.clickSkipButton();
                }
                else tutorialPage.clickSkipButton();
                break;
        }
    }

    @Then("observe the {string} text on Main page")
    public void observeTheTextOnSignupPage(String text) {
        mainPage = new MainPage(driver);
        assert mainPage.getAppNameText().equals(text);
    }
}


