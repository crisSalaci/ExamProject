package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VitaminizareProductPage extends BasePage {

    public VitaminizareProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    private WebElement quantityElement;
    @FindBy(xpath = "//button[text()=\"+\"]")
    private WebElement plusButton;
    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='cart-content-btn']//a[@title='Coș']")
    private WebElement cartButton;

    public void clickPlusButton() {
        elementMethods.waitVisibleElement(plusButton);
        elementMethods.clickElement(plusButton);
        LoggerUtility.infoLog("The user clicks on + button.");
    }

    public void clickAddToCartButton() {
        elementMethods.waitVisibleElement(addToCartButton);
        elementMethods.clickJSElement(addToCartButton);
        LoggerUtility.infoLog("The user clicks on Add to cart button.");
    }

    public void clickCartButton() {
        elementMethods.waitVisibleElement(cartButton);
        elementMethods.clickJSElement(cartButton);
        LoggerUtility.infoLog("The user clicks Cart button.");
    }
}