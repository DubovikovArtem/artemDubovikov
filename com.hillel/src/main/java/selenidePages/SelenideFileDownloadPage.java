package selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFileDownloadPage {

    private final ElementsCollection fileNameLink = $$("#content > div > a");

    public File downloadFile(String fileName) {
        File file = null;
        try {
            file = fileNameLink.find(Condition.text(fileName)).download();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return file;
    }
}
