package selenidePages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFileUploadPage {
    private final SelenideElement uploadFileLink = $x("//*[@id='file-upload']");
    private final SelenideElement button = $("#file-submit");
    private final SelenideElement resultSuccess = $x("//*[@id='content']/div/h3");
    private final SelenideElement resultFileName = $x("//*[@id='uploaded-files']");

    public void uploadFile(File file){
        uploadFileLink.uploadFile(file);
        button.click();
    }

    public String getResult(){
        return resultSuccess.getText();
    }

    public String getFileName(){
        return resultFileName.getText();
    }
}
