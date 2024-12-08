package helpMethods;

import lombok.AllArgsConstructor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@AllArgsConstructor
public class ElementMethods {
    public WebDriver driver;

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void clickJSElement(WebElement element) {
        waitVisibleElement(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void fillElement(WebElement element, String text){
        waitVisibleElement(element);
        element.sendKeys(text);
    }

    public void waitVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clearEditElement(WebElement element, String text){
        waitVisibleElement(element);
        element.clear();
        element.sendKeys(text);
    }

//    public void clickClearEditElement(WebElement element, String text) {
//        waitVisibleElement(element);  // Wait until the element is visible
//        element.click();  // Focus on the element
//        element.clear();  // Clear the field
//
//        // Explicitly wait until the field is empty before sending keys
//        new WebDriverWait(driver, Duration.ofSeconds(2)).until(
//                driver -> element.getAttribute("value").isEmpty()
//        );
//
//        element.sendKeys(text);  // Send the new value
//    }
}
