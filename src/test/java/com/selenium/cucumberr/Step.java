package com.selenium.cucumberr;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

    @Given("user is on login page")
    public void user_is_on_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user enters username and password");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("clicks on login button");
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user is navigated to homepage");
    }

}
