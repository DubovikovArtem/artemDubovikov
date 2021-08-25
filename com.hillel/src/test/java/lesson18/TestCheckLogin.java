package lesson18;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckLogin extends BaseTest {

    private final String validPassword = "SuperSecretPassword!";

    @Test
    public void testLoginSuccess(){
        String validLogin = "tomsmith";
        String validResult = "You logged into a secure area!";
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.cssSelector("[type='text']")).sendKeys(validLogin);
        driver.findElement(By.cssSelector("[type='password']")).sendKeys(validPassword);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        String result = driver.findElement(By.id("flash")).getText();
        String correctResult = result.substring(0, result.length() - 2);

        Assert.assertEquals(validResult, correctResult);
    }

    @Test
    public void testInvalidLogin(){
        String invalidLogin = "tomsmith1";
        String invalidResult = "Your username is invalid!";

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.cssSelector("[type='text']")).sendKeys(invalidLogin);
        driver.findElement(By.cssSelector("[type='password']")).sendKeys(validPassword);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        String result = driver.findElement(By.id("flash")).getText();
        String correctResult = result.substring(0, result.length() - 2);

        Assert.assertEquals(invalidResult, correctResult);
    }

    @Test
    public void testInvalidPassword(){
        String validLogin = "tomsmith";
        String invalidPassword = "qwerty";
        String expectedResult = "Your password is invalid!";

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.cssSelector("[type='text']")).sendKeys(validLogin);
        driver.findElement(By.cssSelector("[type='password']")).sendKeys(invalidPassword);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        String result = driver.findElement(By.id("flash")).getText();
        String correctResult = result.substring(0, result.length() - 2);

        Assert.assertEquals(expectedResult, correctResult);
    }
}
