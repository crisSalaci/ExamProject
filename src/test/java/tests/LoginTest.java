package tests;

import configFiles.DataConfig;
import modelObject.LoginModel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import sharedData.Hooks;

public class LoginTest extends Hooks {

    @Test
    public void metodaTest(){
        LoginModel testLoginData = new LoginModel(DataConfig.LOGIN_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickLoginElement();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillLoginForm(testLoginData);
    }
}
