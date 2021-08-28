package Lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestPicturesUsername extends BaseTest {

    @Test
    public void testPicturesUsername() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.xpath("//div[@class='example']"));
        List<WebElement> listOfPictures = webElement.findElements(By.xpath("//div[@class='figure']//img"));

        for (WebElement mouseAction : listOfPictures) {
            actions.moveToElement(mouseAction).perform();
            List<WebElement> names = mouseAction.findElements(By.xpath("//div[@class='figcaption']//h5"));
            for(WebElement name: names){
                String userName = name.getText();
                if(userName.equals(""))continue;
                System.out.println(userName);
            }
        }
    }
}
