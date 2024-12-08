package tests;

import configFiles.DataConfig;
import modelObject.AddressModel;
import modelObject.LoginModel;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;
import sharedData.Hooks;

public class AddressTest extends Hooks {

    @Test
    public void metodaTest() {
        LoginModel testLoginData = new LoginModel(DataConfig.LOGIN_DATA);
        AddressModel testAddressData = new AddressModel(DataConfig.ADDRESS_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickLoginElement();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillLoginForm(testLoginData);

        AddressPage addressPage = new AddressPage(getDriver());
        addressPage.fillAddressForm(testAddressData);
        addressPage.checkAddAddress(testAddressData);
        addressPage.checkDeleteAddress();
    }
}
