package pageObjects;

import io.qameta.allure.Step;
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

    @Step("LoginPage Set user name")
    public LoginPage setUsername(String username) {
        setValue(setUsername, username);
        return this;
    }
    @Step("LoginPage Set password")
    public LoginPage setPassword(String password) {
        setValue(setPassword, password);
        return this;
    }

    @Step("LoginPage Click login button")
    public SecurePage clickLoginButton() {
        loginButton.click();
        return new SecurePage(driver);
    }
}
