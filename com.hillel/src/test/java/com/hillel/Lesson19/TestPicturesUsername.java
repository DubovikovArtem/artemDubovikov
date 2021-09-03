package com.hillel.Lesson19;

import org.testng.annotations.Test;
import pageObjects.HoverPage;
import pageObjects.MainPage;

public class TestPicturesUsername extends BaseTest {

    /**
     * оставил на память
     * */
        public void testPicturesUsername() {
//        driver.get("https://the-internet.herokuapp.com/hovers");
//        Actions actions = new Actions(driver);
//        WebElement webElement = driver.findElement(By.xpath("//div[@class='example']"));
//        List<WebElement> listOfPictures = webElement.findElements(By.xpath("//div[@class='figure']//img"));
//
//        for (WebElement mouseAction : listOfPictures) {
//            actions.moveToElement(mouseAction).perform();
//            List<WebElement> names = mouseAction.findElements(By.xpath("//div[@class='figcaption']//h5"));
//            for(WebElement name: names){
//                String userName = name.getText();
//                if(userName.equals(""))continue;
//                System.out.println(userName);
//            }
//        }
/*        for(WebElement wrapper: driver.findElements(By.cssSelector(".figure"))){
            actions.moveToElement(wrapper).perform();
            System.out.println(wrapper.findElement(By.tagName("h5")).getText());*/
     //   }
    }

    @Test
    public void testPicturesUsernameV2() {
        openApp();
        new MainPage(driver).goToHoversPage();

        HoverPage hoverPage = new HoverPage(driver);
        hoverPage.showUserName();
    }

}
