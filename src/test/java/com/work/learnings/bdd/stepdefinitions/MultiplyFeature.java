package com.work.learnings.bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.work.learnings.bdd.CalcMultiply;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplyFeature {

	CalcMultiply multiply = null;
	int actualResult = 0;

	@Given("^user calls the multiply method$")
	public void user_calls_the_multiply_method() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		multiply = new CalcMultiply();
	}

	@When("^he enters the numbers (\\d+) and (\\d+)$")
	public void he_enters_the_numbers_and(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		actualResult = multiply.multiply(arg1, arg2);
	}

	@Then("^he should get (\\d+)$")
	public void he_should_get(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (actualResult == arg1) {
			System.out.println("TEST IS PASSED");
		} else {
			System.out.println("TEST IS FAILED");
		}
		assertEquals(arg1, actualResult);
	}

}
