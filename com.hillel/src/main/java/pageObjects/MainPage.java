package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BasePage{

    @FindBy(linkText = "Form Authentication")
    private WebElement loginLink;

    @FindBy(linkText = "Geolocation")
    private WebElement geolocationLink;

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDomLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversLink;

    @FindBy(linkText = "File Download")
    private WebElement fileDownloadLink;

    @FindBy(linkText = "File Upload")
    private WebElement fileUploadLink;

    public MainPage(WebDriver driver){
       super(driver);
        PageFactory.initElements(driver, this);
    }
    @Step("go to login page")
    public LoginPage goToLoginPage(){
        loginLink.click();
        return new LoginPage(driver);
    }

    @Step("go to geolocation page")
    public GeolocationPage goToGeolocationPage(){
        geolocationLink.click();
        return new GeolocationPage(driver);
    }
    @Step("go to Challenging DOM")
    public ChallengingDomPage goToChallengingDOM(){
        challengingDomLink.click();
        return new ChallengingDomPage(driver);
    }

    @Step("go to hovers page")
    public HoverPage goToHoversPage(){
        hoversLink.click();
        return new HoverPage(driver);
    }

    @Step("go to file download page")
    public FileDownloadPage goToFileDownloadPage(){
        fileDownloadLink.click();
        return new FileDownloadPage(driver);
    }

    @Step("go to file upload page")
    public FileUploadPage goToFileUploadPage(){
        fileUploadLink.click();
        return new FileUploadPage(driver);
    }

}
