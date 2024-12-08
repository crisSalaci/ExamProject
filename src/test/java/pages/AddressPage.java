package pages;


import loggerUtility.LoggerUtility;
import modelObject.AddressModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddressPage extends BasePage {

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "addresses-link")
    private WebElement addressElement;
    @FindBy(xpath = "//a[@data-link-action='add-address']")
    private WebElement addAddressElement;
    @FindBy(xpath = "//input[@name='alias']")
    private WebElement aliasElement;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameElement;
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameElement;
    @FindBy(xpath = "//select[@name='id_country']")
    private WebElement countryElement;
    @FindBy(xpath = "//select[@name='id_state']")
    private WebElement stateElement;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityElement;
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address1Element;
    @FindBy(xpath = "//input[@name='address2']")
    private WebElement address2Element;
    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement postCodeElement;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneElement;
    @FindBy(xpath = "//button[@class='btn btn-default form-control-submit']")
    private WebElement saveElement;
    @FindBy(xpath = "//section[@class='page-content row']//li[text()='Adresa adaugata cu succes!']")
    private WebElement addMessageElement;
    //@FindBy(xpath = "(//div[@class='address-body card-block'])[2]/address")
    @FindBy(xpath = "(//div[@class='address-body card-block'])[last()]/address")
    private WebElement newAddress;
    @FindBy(xpath = "(//div[@class='address-footer card-footer'])[last()]/a[@data-link-action='delete-address']")
    private WebElement deleteElement;
    @FindBy(xpath = "//section[@class='page-content row']//li[text()='Adresa stearsa cu succes!']")
    private WebElement deleteMessageElement;

    public void fillAddressForm(AddressModel testAddressData){
        elementMethods.waitVisibleElement(addressElement);
        elementMethods.clickJSElement(addressElement);
        LoggerUtility.infoLog("The user clicks on Address.");
        elementMethods.clickJSElement(addAddressElement);
       // String aliasValue = "alias";
        elementMethods.fillElement(aliasElement,testAddressData.getAlias());
        LoggerUtility.infoLog("The user fills the alias field with: "+testAddressData.getAlias());
        elementMethods.waitVisibleElement(lastNameElement);
        //String lastNameValue="Sal";
        elementMethods.clearEditElement(lastNameElement,testAddressData.getLastName());
        LoggerUtility.infoLog("The user fills the last name field with: "+testAddressData.getLastName());
        elementMethods.waitVisibleElement(firstNameElement);
        //String firstNameValue="Cris";
        elementMethods.clearEditElement(firstNameElement,testAddressData.getFirstName());
        LoggerUtility.infoLog("The user fills the first name field with: "+testAddressData.getFirstName());
        //String countryValue = "România";
        elementMethods.fillElement(countryElement,testAddressData.getCountry());
        LoggerUtility.infoLog("The user fills the country field with: "+testAddressData.getCountry());
        //String stateValue = "Arad";
        elementMethods.fillElement(stateElement,testAddressData.getState());
        LoggerUtility.infoLog("The user fills the state field with: "+testAddressData.getState());
        //String cityValue = "Arad";
        elementMethods.fillElement(cityElement,testAddressData.getCity());
        LoggerUtility.infoLog("The user fills the city field with: "+testAddressData.getCity());
       // String address1Value = "strada Garii, numarul 8";
        elementMethods.fillElement(address1Element,testAddressData.getAddress1());
        LoggerUtility.infoLog("The user fills the address1 field with: "+testAddressData.getAddress1());
        //String address2Value = "bloc A, scara B, apartament 14";
        elementMethods.fillElement(address2Element,testAddressData.getAddress2());
        LoggerUtility.infoLog("The user fills the address2 field with: "+testAddressData.getAddress2());
        //String postCodeValue = "300789";
        elementMethods.fillElement(postCodeElement,testAddressData.getPostCode());
        LoggerUtility.infoLog("The user fills the post code field with: "+testAddressData.getPostCode());
        //String phoneValue = "0749234444";
        elementMethods.fillElement(phoneElement,testAddressData.getPhone());
        LoggerUtility.infoLog("The user fills the phone field with: "+testAddressData.getPhone());
        elementMethods.clickJSElement(saveElement);
        LoggerUtility.infoLog("The user clicks save.");
    }

    public void checkAddAddress(AddressModel testAddressData){
        String actualAddMessage = addMessageElement.getText();
        String expectedAddMessage = "Adresa adaugata cu succes!";
        LoggerUtility.infoLog("The user validates the message to be: "+expectedAddMessage);
        Assert.assertEquals(actualAddMessage, expectedAddMessage, "The message is incorrect!");
        String actualNewAddress = newAddress.getText();
        String expectedNewAddress = testAddressData.getFirstName()+" " + testAddressData.getLastName() + "\n" + testAddressData.getCountry() + "\n" + testAddressData.getState() + "\n" + testAddressData.getCity() + "\n" + testAddressData.getAddress1() + "\n" + testAddressData.getAddress2() + "\n" + testAddressData.getPostCode() + "\n" + testAddressData.getPhone();
        LoggerUtility.infoLog("The user validates the address to be: "+expectedNewAddress);
        Assert.assertEquals(actualNewAddress, expectedNewAddress, "The new address is incorrect!");
    }

    public void checkDeleteAddress(){
        elementMethods.clickJSElement(deleteElement);
        LoggerUtility.infoLog("The user clicks delete.");

        String actualDeleteMessage = deleteMessageElement.getText();
        String expectedDeleteMessage = "Adresa stearsa cu succes!";
        LoggerUtility.infoLog("The user validates the message to be: "+expectedDeleteMessage);
        Assert.assertEquals(actualDeleteMessage, expectedDeleteMessage, "The message is incorrect!");
    }

}
