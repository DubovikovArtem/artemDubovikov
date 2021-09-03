package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HoverPage extends BasePage {
    private By figure = By.cssSelector(".figure");
    private By name = By.tagName("h5");

    public HoverPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void showUserName() {
        for (WebElement element : driver.findElements(figure)) {
            actions.moveToElement(element).perform();
            System.out.println(element.findElement(name).getText());
        }
    }

}
