package pageObjects;

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

    public LoginPage goToLoginPage(){
        loginLink.click();
        return new LoginPage(driver);
    }

    public GeolocationPage goToGeolocationPage(){
        geolocationLink.click();
        return new GeolocationPage(driver);
    }

    public ChallengingDomPage goToChallengingDOM(){
        challengingDomLink.click();
        return new ChallengingDomPage(driver);
    }

    public HoverPage goToHoversPage(){
        hoversLink.click();
        return new HoverPage(driver);
    }

    public FileDownloadPage goToFileDownloadPage(){
        fileDownloadLink.click();
        return new FileDownloadPage(driver);
    }

    public FileUploadPage goToFileUploadPage(){
        fileUploadLink.click();
        return new FileUploadPage(driver);
    }

}
