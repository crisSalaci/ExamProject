package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RollOnProductPage extends BasePage{

    public RollOnProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//button[text()=\"Continuă\"]")
    private WebElement continuaButton;

    public void clickAddToCartButton(){
        elementMethods.clickJSElement(addToCartButton);
        LoggerUtility.infoLog("The user clicks on Add to cart button.");
    }

    public void clickContinuaButton(){
        elementMethods.clickJSElement(continuaButton);
        LoggerUtility.infoLog("The user clicks on Continua button.");
    }
}
