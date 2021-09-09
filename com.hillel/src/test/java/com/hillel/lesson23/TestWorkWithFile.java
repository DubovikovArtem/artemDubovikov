package com.hillel.lesson23;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FileDownloadPage;
import pageObjects.FileUploadPage;
import pageObjects.MainPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestWorkWithFile extends BaseTest {
    private final String fileName = "recovery_codes.txt";

    @Test
    public void testFileDownload() throws IOException {
        FileDownloadPage fileDownloadPage = new FileDownloadPage(driver);
        openApp();
        new MainPage(driver).goToFileDownloadPage();
        fileDownloadPage.downloadFile(fileName);

        Path paths = Paths.get("target\\" + fileName);
        List<String> fileText = Files.readAllLines(paths);
        fileText.add("Add text to file");
        Files.write(paths, fileText);
    }

    @Test
    public void testFileUpload() {
        String path = "D:\\GitProject\\artemDubovikov\\com.hillel\\target\\";
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        openApp();
        new MainPage(driver).goToFileUploadPage();
        fileUploadPage.uploadFile(path + fileName);
        Assert.assertEquals(fileUploadPage.getResult(),"File Uploaded!");
        Assert.assertEquals(fileUploadPage.getFileName(),fileName);
    }
}
