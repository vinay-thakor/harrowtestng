package uk.gov.harrow.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestBase extends HomePage {
    BrowserSelector selectBrowser = new BrowserSelector();
    String baseURL = "https://www.harrow.gov.uk/";

    @BeforeMethod
    public void openBrowser() {

        selectBrowser.selectBrowser("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
