Feature: Login for salesforce Application

  Scenario: using active username and password able to login
    Given Open the browser
    Given The salesforce URL
    And Enter the username 'hari.radhakrishnan@qeagle.com'
    And Enter the Password 'Leaf$1234'
    When Click Login button
    Then Successfully logedin 
    
  Scenario: using inactive username and password not able to login
    Given Open the browser
    Given The salesforce URL
    And Enter the username 'hari.radhakrishnan@qeagle.com'
    And Enter the Password 'Leaf$12345'
    When Click Login button
    But Not Successfully logedin 
    
