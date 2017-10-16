Feature: Calculate
 
  Scenario: calculate multiplication
    Given user calls the multiply method
    When he enters the numbers 5 and 10
    Then he should get 50

  Scenario: calculate division
    Given user calls the divide method
    When he enters the numbers for division 100 and 10
    Then he should get it divided to 10