package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a[@title='Log in to your customer account']")
    private WebElement loginElement;
    @FindBy(id = "st_ma_6")
    private WebElement productTypeMenu;
    @FindBy(xpath = "//div[@class='stmenu_sub style_wide col-md-4']//a[@title='Roll on']")
    private WebElement rollOnElement;
    @FindBy(id = "st_ma_8")
    private WebElement afectiuniMenu;
    @FindBy(xpath = "//div[@class='stmenu_sub style_wide col-md-4']//a[@title='Vitaminizare']")
    private WebElement vitaminizareElement;

    public void clickLoginElement(){
        elementMethods.clickJSElement(loginElement);
        LoggerUtility.infoLog("The user clicks on Login.");
    }

    public void clickProductTypeMenu(){
        elementMethods.clickJSElement(productTypeMenu);
        LoggerUtility.infoLog("The user clicks on Product type menu");
    }

    public void clickRollOnElement(){
        elementMethods.clickJSElement(rollOnElement);
        LoggerUtility.infoLog("The user clicks on Roll On element");
    }

    public void clickAfectiuniMenu(){
        elementMethods.clickJSElement(afectiuniMenu);
        LoggerUtility.infoLog("The user clicks on Afectiuni menu");
    }

    public void clickVitaminizareElement(){
        elementMethods.clickJSElement(vitaminizareElement);
        LoggerUtility.infoLog("The user clicks on Vitaminizare element");
    }
}
