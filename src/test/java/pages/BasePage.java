package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods=new ElementMethods(this.driver);
        PageFactory.initElements(this.driver,this);
    }
}
