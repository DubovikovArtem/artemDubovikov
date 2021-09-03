package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{

    private final By byMessage = By.id("flash");
    private final By byLogoutButton = By.cssSelector("a.button");

    public SecurePage(WebDriver driver) {
     super(driver);
    }

    public String getMessage() {
        return driver.findElement(byMessage).getText();
    }

    public LoginPage logout() {
        driver.findElement(byLogoutButton).click();
        return new LoginPage(driver);
    }
}
