package Lesson19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDropdownMenu extends BaseTest {

    @Test
    public void test() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        driver.findElement(By.id("bs-example-navbar-collapse-1"));
        Actions actions = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown']"));
        actions.moveToElement(dropdown).perform();

        WebElement secondaryAction = dropdown.findElement(By.xpath("//li[@class='secondary-dropdown']//a[1]"));
        actions.moveToElement(secondaryAction).perform();
        secondaryAction.findElement(By.xpath("//ul[@class='dropdown-menu secondary']//a[1]")).click();

        String text = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1")).getText();
        Assert.assertEquals(text,"Secondary Page");
    }
}
