package com.work.learnings.bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.work.learnings.bdd.Currency;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrencyFeature {

	Currency currency = null;
	int actualResult = 0;

	@Given("^user calls the convert method$")
	public void user_calls_the_convert_method() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		currency = new Currency();
	}

	@When("^he enters the input as \"([^\"]*)\" , \"([^\"]*)\" and (\\d+)$")
	public void he_enters_the_input_as_and(String arg1, String arg2, int arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actualResult = currency.convert(arg1, arg2, arg3);
	}

	@Then("^he should get the converted value as (\\d+)$")
	public void he_should_get_the_converted_value_as(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, actualResult);
	}

}
