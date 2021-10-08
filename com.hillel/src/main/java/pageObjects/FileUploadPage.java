package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends BasePage {
    @FindBy(xpath = "//*[@id='file-upload']")
    private WebElement uploadFileLink;

    @FindBy(css = "#file-submit")
    private WebElement button;

    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement resultSuccess;

    @FindBy(xpath = "//*[@id='uploaded-files']")
    private WebElement resultFileName;

    public FileUploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @Step("FileUploadPage upload")
    public void uploadFile(String path){
        uploadFileLink.sendKeys(path);
        button.click();
    }
    @Step("FileUploadPage get result")
    public String getResult(){
        return resultSuccess.getText();
    }

    @Step("FileUploadPage get file name")
    public String getFileName(){
        return resultFileName.getText();
    }

}
