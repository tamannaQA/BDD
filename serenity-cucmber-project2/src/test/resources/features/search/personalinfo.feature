Feature: Enter Personal Information

  @personalinfo
  Scenario Outline: Test Personal Information
    Given I am on the personal info page
    When I enter '<firstname>' as my first name 
    And I enter my last name '<lname>'
    And I enter '<city>' as my city
    And I enter my state '<state>'
    And I select my race '<race>'
    And I click the submit button
   Then I verify '<firstname>' to be my first name 
    And I verify '<lname>' to be my last name  
    And I verify '<city>' to my city
    And I verify '<state>' to be my state 
   And I verify '<race>' to be my race 

   
    
   Examples: 
      |firstname |  lname |  state    |  race           |  city      |
      | John     |  Doe   |  Virginia |African American | Alexandria |
   


   