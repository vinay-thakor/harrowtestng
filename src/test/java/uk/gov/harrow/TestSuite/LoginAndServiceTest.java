package uk.gov.harrow.TestSuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;


public class LoginAndServiceTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test(priority = 3,groups = {"Smoke","Regression"})
    public void userShouldClickOnLoginRegisterlink() {
        homePage.clickOnLoginRegisterLink();

    }

    @Test(priority = 2,groups = {"Sanity","Regression"})
    public void userShouldClickOnServiceLink(){
        homePage.clickOnServiceLink();
    }
}