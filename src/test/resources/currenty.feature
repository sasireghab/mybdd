Feature: Currency
 
  Scenario: Convert Currency
    Given user calls the convert method
    When he enters the input as "GBP" , "INR" and 10
    Then he should get the converted value as 850
    
    

  