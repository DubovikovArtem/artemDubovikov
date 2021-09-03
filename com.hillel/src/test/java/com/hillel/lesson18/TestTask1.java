package com.hillel.lesson18;

import org.testng.annotations.Test;
import pageObjects.ChallengingDomPage;

import pageObjects.MainPage;

public class TestTask1 extends BaseTest {
    @Test
    public void testGetGeoLocation(){
        openApp();
        new MainPage(driver)
                .goToChallengingDOM()
                .clickBlueButton()
                .clickRadButton()
                .clickGreenButton();

        ChallengingDomPage challengingDomPage = new ChallengingDomPage(driver);
        challengingDomPage.showTableValue();
    }
}
