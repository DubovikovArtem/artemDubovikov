package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestTask1 extends BaseTest {
    @Test
    public void testGetGeoLocation() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(By.xpath("//div[@class='large-2 columns']//a[1]")).click();
        driver.findElement(By.xpath("//div[@class='large-2 columns']//a[2]")).click();
        driver.findElement(By.xpath("//div[@class='large-2 columns']//a[3]")).click();

        WebElement tr = driver.findElement(By.className("large-10")).findElement(By.tagName("table")).findElement(By.tagName("tbody"));
        List<WebElement> listTr = tr.findElements(By.tagName("tr"));
        List<WebElement> listTd;

        for (WebElement trs : listTr) {
            trs.findElements(By.tagName("td"));
            listTd = trs.findElements(By.tagName("td"));
            for (int j = 0; j < listTd.size(); j++) {
                WebElement x = listTd.get(j);
                String show = x.getText();
                if (j == 3) {
                    System.out.println(show);
                }
            }
        }
    }
}
