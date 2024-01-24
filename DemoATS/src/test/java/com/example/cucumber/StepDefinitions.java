package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private String greeting;

    @Given("I have a greeting")
    public void iHaveAGreeting() {
        // Assume you have a method or logic to retrieve the greeting
        greeting = "Hello, World!";
    }

    @When("I say hello")
    public void iSayHello() {
        // Assume you have a method or logic to perform an action
    }

    @Then("I should see the greeting")
    public void iShouldSeeTheGreeting() {
        assertEquals("Hello, World!", greeting);
    }
}
