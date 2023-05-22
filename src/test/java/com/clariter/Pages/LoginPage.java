package com.clariter.Pages;

import com.clariter.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.clariter.Utilities.Driver;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(xpath = "(//img[@alt='Login'])[2]")
    public WebElement account;

    @FindBy(id="loginUsername")
    public WebElement userName;

    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement cookies;

    @FindBy(id="loginPassword")
    public WebElement password;

    @FindBy(linkText = "Accedi")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        cookies.click();
        Thread.sleep(5000);
        account.click();
        userName.sendKeys(userNameStr);
        Thread.sleep(3000);
        password.sendKeys(passwordStr);
        Thread.sleep(3000);
        submit.click();
    }
}
