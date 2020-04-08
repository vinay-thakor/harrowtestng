package uk.gov.harrow.TestSuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;


public class LoginAndServiceTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void userShouldClickOnLoginRegisterlink() {
        homePage.clickOnLoginRegisterLink();

    }
    @Test
    public void userShouldClickOnServiceLink(){
        homePage.clickOnServiceLink();
    }
}