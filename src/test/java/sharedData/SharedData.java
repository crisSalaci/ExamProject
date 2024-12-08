package sharedData;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import sharedData.browserService.ChromeService;
import sharedData.browserService.EdgeService;

@Getter
public class SharedData {

    private WebDriver driver;

    public void setupDriver() {
        String browser = System.getProperty("browser");

        switch (browser) {
            case "edge":
                EdgeService edgeService = new EdgeService();
                edgeService.openBrowser();
                driver = edgeService.getDriver();
                break;
            case "chrome":
                ChromeService chromeService = new ChromeService();
                chromeService.openBrowser();
                driver = chromeService.getDriver();
                break;
        }
    }

    public void quitDriver() {
        driver.quit();
    }
}
