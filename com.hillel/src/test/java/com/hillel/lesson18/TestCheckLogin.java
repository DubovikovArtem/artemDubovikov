package com.hillel.lesson18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SecurePage;

public class TestCheckLogin extends BaseTest {

    @Test
    public void loginTestSuccess() {
        openApp();
        SecurePage securePage = new MainPage(driver)
                .goToLoginPage()
                .setPassword("SuperSecretPassword!")
                .setUsername("tomsmith")
                .clickLoginButton();

        Assert.assertTrue(securePage.getMessage().contains("You logged into a secure area!"),
                "User should be logged in");

        securePage.logout();
    }

    @Test
    public void invalidLoginTest() {
        openApp();

        String msg = new MainPage(driver)
                .goToLoginPage()
                .setPassword("SuperSecretPassword!")
                .setUsername("tomsmith1")
                .clickLoginButton().getMessage();

        Assert.assertTrue(msg.contains("Your username is invalid!"), "Negative case");
    }

    @Test
    public void invalidPasswordTest() {
        openApp();

        String msg = new MainPage(driver)
                .goToLoginPage()
                .setPassword("SuperSecretPasswor1!")
                .setUsername("tomsmith")
                .clickLoginButton().getMessage();

        Assert.assertTrue(msg.contains("Your password is invalid!"), "Negative case");
    }
}
