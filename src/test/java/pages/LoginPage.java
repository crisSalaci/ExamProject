package pages;

import loggerUtility.LoggerUtility;
import modelObject.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/input[@type='email']")
    private WebElement emailElement;
    @FindBy(xpath = "//div/input[@type='password']")
    private WebElement passwordElement;
    @FindBy(id = "SubmitLogin")
    private WebElement submitElement;

    public void fillLoginForm(LoginModel testData){
        elementMethods.fillElement(emailElement,testData.getEmail());
        LoggerUtility.infoLog("The user fills the email field with: "+testData.getEmail());
        elementMethods.fillElement(passwordElement,testData.getPassword());
        LoggerUtility.infoLog("The user fills the password field with: "+testData.getPassword());
        elementMethods.clickJSElement(submitElement);
        LoggerUtility.infoLog("The user clicks on submit.");
    }
}
