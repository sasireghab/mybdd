package com.work.learnings.bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.work.learnings.bdd.CalcDivide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DivideFeature {

	CalcDivide divideObject = null;
	int actualResult = 0;

	@Given("^user calls the divide method$")
	public void user_calls_the_divide_method() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		divideObject = new CalcDivide();

	}

	@When("^he enters the numbers for division (\\d+) and (\\d+)$")
	public void he_enters_the_numbers_for_division_and(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actualResult = divideObject.divide(arg1, arg2);
	}

	@Then("^he should get it divided to (\\d+)$")
	public void he_should_get_it_divided_to(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, actualResult);
	}
}
