Feature: Login to Steal my login

  @tag2
  Scenario Outline: Login test
    Given I am on the stealmy my login home page
    When I enter my username '<username>'
    And I enter my password '<password>'
    And I enter my firstname '<fname>'
    Then I click the login button
    Then I am directed to a demo page
    
   Examples: 
      | username | password |fname    |
      | mislam   | Testpass | Mesbah  |
   
