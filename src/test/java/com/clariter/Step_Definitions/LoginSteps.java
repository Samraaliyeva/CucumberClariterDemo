package com.clariter.Step_Definitions;

import com.clariter.Pages.LoginPage;
import com.clariter.Utilities.ConfigurationReader;
import com.clariter.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters his credentials")
    public void the_user_enters_his_credentials() throws InterruptedException {
        String username = ConfigurationReader.get("user");
        String password = ConfigurationReader.get("pass");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("you logged in");
    }
}
