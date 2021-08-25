package lesson18;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCheckGps extends BaseTest{
    @Test
    public void testGetGeoLocation() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        driver.findElement(By.className("example")).findElement(By.tagName("button")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("demo"));
        String latValue = driver.findElement(By.id("lat-value")).getText();
        String longValue = driver.findElement(By.id("long-value")).getText();

        System.out.println("lat-value: "+ latValue);
        System.out.println("long-value: "+ longValue);
    }
}
