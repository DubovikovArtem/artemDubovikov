package com.hillel.lesson18;


import org.testng.annotations.Test;

import pageObjects.GeolocationPage;
import pageObjects.MainPage;

public class TestCheckGps extends BaseTest {
    @Test
    public void testGeoLocation() {
        openApp();
        GeolocationPage geolocationPage = new MainPage(driver)
                .goToGeolocationPage()
                .clickGeolocationButton();

        System.out.println("Latitude: " + geolocationPage.getLatitude());
        System.out.println("Longitude: " + geolocationPage.getLongitude());
    }

}
