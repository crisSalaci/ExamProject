package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VitaminizarePage extends BasePage{
    public VitaminizarePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"act_box_cart  display_normal  add_show_on_mobile \"]//a[@href='https://fares.ro/produs/vitaminizant-cu-macese-si-catina-f154-cpr/']")
    private WebElement vitaminizareProductView;

    public void clickVitaminizareProductView(){
        elementMethods.clickJSElement(vitaminizareProductView);
        LoggerUtility.infoLog("The user clicks on View Vitaminizare Product.");
    }
}
