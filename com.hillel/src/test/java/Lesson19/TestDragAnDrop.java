package Lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDragAnDrop extends BaseTest {
    @Test
    public void dragAnDrop() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        Actions actions = new Actions(driver);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        actions.clickAndHold(drag).moveToElement(drop).release().perform();
        String result = drop.getText();
        Assert.assertEquals(result, "Dropped!");
    }

}
