package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='cart-item line_item']//a[@href='https://fares.ro/produs/ulei-distonoplant-n156/']")
    private WebElement cartElement1;
    @FindBy(xpath = "(//div[@class='qty_wrap'])[1]//input[@value]")
    private WebElement qtyElement1;
    @FindBy(xpath = "(//a[@class='remove-from-cart'])[1]")
    private WebElement removeElement1;
    @FindBy(xpath = "//li[@class='cart-item line_item']//a[@href='https://fares.ro/produs/vitaminizant-cu-macese-si-catina-f154-cpr/']")
    private WebElement cartElement2;
    @FindBy(xpath = "(//div[@class='qty_wrap'])[2]//input[@value]")
    private WebElement qtyElement2;
    @FindBy(xpath = "(//a[@class='remove-from-cart'])[2]")
    private WebElement removeElement2;

    public void checkQtyElement1(){
        String actualQtyElement1 = qtyElement1.getAttribute("value");
        Assert.assertEquals(actualQtyElement1, "1",  "The quantity is incorrect for Element1!");
        LoggerUtility.infoLog("The user validates the quantity to be: 1");
    }

    public void checkQtyElement2(){
        String actualQtyElement2 = qtyElement2.getAttribute("value");
        Assert.assertEquals(actualQtyElement2, "2",  "The quantity is incorrect for Element2!");
        LoggerUtility.infoLog("The user validates the quantity to be: 2");
    }

    public void clickRemoveElementsFromCart(){
        elementMethods.clickJSElement(removeElement1);
        LoggerUtility.infoLog("The user removes Element1");
        elementMethods.clickJSElement(removeElement2);
        LoggerUtility.infoLog("The user removes Element2");
    }
}
