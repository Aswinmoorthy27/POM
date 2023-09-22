
Feature: Createlead
  Scenario: Createlead creation scenario
    When Click on Crmsfa link
    And Click on lead button
    And Click on create lead 
    Given Company name as 'Testleaf'
    Given first name as 'Subraja'
    Given Last name as 'Subi'
    And Enter phonenumber '99'
    Then click on submit button
     
