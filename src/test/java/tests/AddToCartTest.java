package tests;

import configFiles.DataConfig;
import modelObject.LoginModel;
import org.testng.annotations.Test;
import pages.*;
import sharedData.Hooks;

public class AddToCartTest extends Hooks {

    @Test
    public void metodaTest(){
        LoginModel testLoginData = new LoginModel(DataConfig.LOGIN_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickLoginElement();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillLoginForm(testLoginData);

        homePage.clickProductTypeMenu();
        homePage.clickRollOnElement();

        RollOnPage rollOnPage = new RollOnPage(getDriver());
        rollOnPage.clickRollOnProductView();

        RollOnProductPage rollOnProductPage = new RollOnProductPage(getDriver());
        rollOnProductPage.clickAddToCartButton();
        rollOnProductPage.clickContinuaButton();

        homePage.clickAfectiuniMenu();
        homePage.clickVitaminizareElement();

        VitaminizarePage vitaminizarePage = new VitaminizarePage(getDriver());
        vitaminizarePage.clickVitaminizareProductView();

        VitaminizareProductPage vitaminizareProductPage = new VitaminizareProductPage(getDriver());
        vitaminizareProductPage.clickPlusButton();
        vitaminizareProductPage.clickAddToCartButton();
        vitaminizareProductPage.clickCartButton();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.checkQtyElement1();
        cartPage.checkQtyElement2();
        cartPage.clickRemoveElementsFromCart();
    }
}
