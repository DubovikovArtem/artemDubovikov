package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{

    private final By byMessage = By.id("flash");
    private final By byLogoutButton = By.cssSelector("a.button");

    public SecurePage(WebDriver driver) {
     super(driver);
    }
    @Step("Secure page get massage")
    public String getMessage() {
        return driver.findElement(byMessage).getText();
    }
    @Step("Secure page logout")
    public LoginPage logout() {
        driver.findElement(byLogoutButton).click();
        return new LoginPage(driver);
    }
}
