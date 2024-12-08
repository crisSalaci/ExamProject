package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RollOnPage extends BasePage{

    public RollOnPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"act_box_cart  display_normal  add_show_on_mobile \"]//a[@href='https://fares.ro/produs/ulei-distonoplant-n156/']")
    private WebElement rollOnProductView;

    public void clickRollOnProductView(){
        elementMethods.clickJSElement(rollOnProductView);
        LoggerUtility.infoLog("The user clicks on View Roll on Product.");
    }
}
