package selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDynamicControlsPage {
    private final SelenideElement checkBoxLink = $("#checkbox > input[type=checkbox]");
    private final SelenideElement removeButtonLink = $("#checkbox-example > button");

    private final SelenideElement enableDisableLink = $("#input-example > button");
    private final SelenideElement inputTextLink = $("#input-example > input[type=text]");
    private final SelenideElement messageLink = $("#message");

    public void clickCheckBox() {
        checkBoxLink.click();
        checkBoxLink.shouldBe(Condition.checked);
    }

    public void clickButtonRemoveAdd(boolean action) {
        if (action) {
            removeButtonLink.shouldHave(Condition.exactText("Remove")).click();
        } else {
            removeButtonLink.shouldHave(Condition.exactText("Add")).click();
        }
    }

    public String showMessage() {
        return messageLink.shouldBe(Condition.visible).getText();
    }

    public void clickButtonEnableDisable(boolean action) {
        if (action) {
            enableDisableLink.shouldHave(Condition.exactText("Enable")).click();
        } else {
            enableDisableLink.shouldHave(Condition.exactText("Disable")).click();
        }
    }

    public void inputText(String msg){
        inputTextLink.shouldBe(Condition.enabled).sendKeys(msg);
    }

}
