package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage {
    @FindBy(tagName = "button")
    private WebElement geolocationButton;

    @FindBy(id = "lat-value")
    private WebElement getLat;

    @FindBy(id = "long-value")
    private WebElement getLng;


    public GeolocationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("GeolocationPage click geolocation button")
    public GeolocationPage clickGeolocationButton() {
        geolocationButton.click();
        return new GeolocationPage(driver);
    }

    @Step("GeolocationPage get lat")
    public String getLatitude() {
        return wait.until(ExpectedConditions.visibilityOf(getLat)).getText();
    }

    @Step("GeolocationPage get lon")
    public String getLongitude() {
        return wait.until(ExpectedConditions.visibilityOf(getLng)).getText();
    }

}
