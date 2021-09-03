package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement setUsername;

    @FindBy(id = "password")
    private WebElement setPassword;

    @FindBy(id = "flash")
    private WebElement message;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        wait.until(ExpectedConditions.visibilityOf(setUsername));
    }

    public String getMessage() {
        return message.getText();
    }

    public LoginPage setUsername(String username) {
        setValue(setUsername, username);
        return this;
    }

    public LoginPage setPassword(String password) {
        setValue(setPassword, password);
        return this;
    }

    public SecurePage clickLoginButton() {
        loginButton.click();
        return new SecurePage(driver);
    }
}
