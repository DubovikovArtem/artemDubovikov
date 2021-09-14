package com.hillel.lesson25;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenidePages.SelenideFileDownloadPage;
import selenidePages.SelenideFileUploadPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class TestWorkWithFileUseSelenide {
    private final String fileName = "some-file.txt";

    @Test
    public void testDownloadAndUploadFile() throws IOException {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        open("download");

        SelenideFileDownloadPage selenideFileDownload = new SelenideFileDownloadPage();
        File file = selenideFileDownload.downloadFile(fileName);

        Path paths = Paths.get(file.getAbsolutePath());
        List<String> fileText = Files.readAllLines(paths);
        fileText.add("Add text to file");
        Files.write(paths, fileText);

        open("upload");
        SelenideFileUploadPage selenideFileUpload = new SelenideFileUploadPage();
        selenideFileUpload.uploadFile(file);

        Assert.assertEquals(selenideFileUpload.getResult(), "File Uploaded!");
        Assert.assertEquals(selenideFileUpload.getFileName(), fileName);
    }

}
