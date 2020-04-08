package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {

    By loginRegisterLink = By.linkText("Log in / Register");
    By serviceBtn = By.className("button__text");

    public void clickOnLoginRegisterLink() {
        clickOnElement(loginRegisterLink);
    }
    public void clickOnServiceLink(){
        clickOnElement(serviceBtn);
    }
}