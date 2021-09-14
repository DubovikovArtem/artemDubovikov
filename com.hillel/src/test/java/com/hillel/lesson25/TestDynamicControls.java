package com.hillel.lesson25;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenidePages.SelenideDynamicControlsPage;

import static com.codeborne.selenide.Selenide.open;

public class TestDynamicControls {

    @Test
    public void removeAddTest() {
        open("https://the-internet.herokuapp.com/dynamic_controls");
        SelenideDynamicControlsPage selenideDynamicControlsPage = new SelenideDynamicControlsPage();
        selenideDynamicControlsPage.clickCheckBox();
        selenideDynamicControlsPage.clickButtonRemoveAdd(true);
        String msgGone = selenideDynamicControlsPage.showMessage();

        selenideDynamicControlsPage.clickButtonRemoveAdd(false);
        String msgBack = selenideDynamicControlsPage.showMessage();

        Assert.assertEquals(msgGone, "It's gone!");
        Assert.assertEquals(msgBack, "It's back!");
    }

    @Test
    public void enableDisableTest() {
        open("https://the-internet.herokuapp.com/dynamic_controls");
        SelenideDynamicControlsPage selenideDynamicControlsPage = new SelenideDynamicControlsPage();
        selenideDynamicControlsPage.clickButtonEnableDisable(true);
        selenideDynamicControlsPage.inputText("my message!");
        String msgEnabled = selenideDynamicControlsPage.showMessage();

        selenideDynamicControlsPage.clickButtonEnableDisable(false);
        String msgDisabled = selenideDynamicControlsPage.showMessage();

        Assert.assertEquals(msgEnabled, "It's enabled!");
        Assert.assertEquals(msgDisabled, "It's disabled!");

    }
}
