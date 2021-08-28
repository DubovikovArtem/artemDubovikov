package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCheckGps extends BaseTest{
    @Test
    public void testGetGeoLocation() {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.findElement(By.className("example")).findElement(By.tagName("button")).click();

        driver.findElement(By.id("demo"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lat-value")));
        String latValue = driver.findElement(By.id("lat-value")).getText();
        String longValue = driver.findElement(By.id("long-value")).getText();

        System.out.println("lat-value: "+ latValue);
        System.out.println("long-value: "+ longValue);
    }
}
