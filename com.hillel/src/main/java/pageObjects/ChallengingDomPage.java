package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage extends BasePage {

    @FindBy(xpath = "//div[@class='large-2 columns']//a[1]")
    private WebElement buttonBlue;

    @FindBy(xpath = "//div[@class='large-2 columns']//a[2]")
    private WebElement buttonRad;

    @FindBy(xpath = "//div[@class='large-2 columns']//a[3]")
    private WebElement buttonGreen;

    @FindBy(css = " tr > td:nth-child(4)")
    private List<WebElement> tableValue;

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("ChallengingDomPage Click blue button")
    public ChallengingDomPage clickBlueButton() {
        buttonBlue.click();
        return new ChallengingDomPage(driver);
    }

    @Step("ChallengingDomPage Click rad button")
    public ChallengingDomPage clickRadButton() {
        buttonRad.click();
        return new ChallengingDomPage(driver);
    }

    @Step("ChallengingDomPage Click green button")
    public ChallengingDomPage clickGreenButton() {
        buttonGreen.click();
        return new ChallengingDomPage(driver);
    }

    @Step("ChallengingDomPage show table value")
    public void showTableValue() {
        for (WebElement element : tableValue) {
            System.out.println(element.getText());
        }
    }

}
