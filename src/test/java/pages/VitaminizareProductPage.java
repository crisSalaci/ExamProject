package pages;

import loggerUtility.LoggerUtility;
import modelObject.AddressModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
//    @FindBy(xpath = "//div[@class='alert alert-success' and contains(text(),'Produs adăugat cu succes în coșul de cumpărături')]")
//    private WebElement addToCartMessage;
    @FindBy(xpath = "//div[@class='cart-content-btn']//a[@title='Coș']")
    private WebElement cartButton;

//    public void fillQuantityElement(){
//        elementMethods.waitVisibleElement(quantityElement);
//        elementMethods.clickClearEditElement(quantityElement,"2");
//        LoggerUtility.infoLog("The user fills Quantity with 2.");
//    }

    public void clickPlusButton(){
        elementMethods.waitVisibleElement(plusButton);
        elementMethods.clickElement(plusButton);
        LoggerUtility.infoLog("The user clicks on + button.");
    }

    public void clickAddToCartButton(){
        elementMethods.waitVisibleElement(addToCartButton);
        elementMethods.clickJSElement(addToCartButton);
        LoggerUtility.infoLog("The user clicks on Add to cart button.");
    }

//    public void checkAddToCartMessage(){
//        String actualAddToCartMessage = addToCartMessage.getText();
//        String expectedAddToCartMessage = "Produs adăugat cu succes în coșul de cumpărături";
//        LoggerUtility.infoLog("The user validates the message to be: "+expectedAddToCartMessage);
//        Assert.assertEquals(actualAddToCartMessage, expectedAddToCartMessage, "The message is incorrect!");
//    }

    public void clickCartButton(){
        elementMethods.waitVisibleElement(cartButton);
        elementMethods.clickJSElement(cartButton);
        LoggerUtility.infoLog("The user clicks Cart button.");
    }


}
