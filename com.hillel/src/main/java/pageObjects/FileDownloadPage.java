package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FileDownloadPage extends BasePage {

    @FindBy(css = "#content > div > a")
    private List<WebElement> fileNameLink;

    public FileDownloadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void downloadFile(String fileName) {
        for (WebElement element: fileNameLink) {
            String elementText = element.getText();
            if(elementText.equals(fileName)){
                element.click();
            }
        }
    }
}
