package starter.stepdefinitions;


import org.openqa.selenium.support.ui.Select;

import WebPages.PersonalInfoModelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class PersonalInfoStepDefinitions {
	
	@Steps
	PersonalInfoModelPage modelPage;
		

	
	@Given("^I am on the personal info page$")
	public void i_am_on_the_personal_info_page() throws Exception{
		
		modelPage.launchHomePage();
	   
	}
	

	@Then("^I enter '(.*)' as my first name$")
	public void i_enter_as_my_first_name(String fname) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("first name: " + fname);
		modelPage.enterFirstname(fname);
	}
   

	@And("^I enter my last name '(.*)'$")
	public void i_enter_my_lastname(String lname) throws Exception {
		
		modelPage.enterLastname(lname);
		
		//homePage.enterUsername(username);
	    
	}
	
	@Then("^I enter '(.*)' as my city$")
	public void i_enter_as_my_city(String city) throws Exception {
  	modelPage.enterCityname(city);
	}
	
	@And("^I enter my state '(.*)'$")
	public void i_enter_my_state(String state) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		modelPage.enterStateName(state);
		
		// state = new Select(dropdownSelect);
	}	


	@And("^I select my race '(.*)'$")
	public void i_select_my_race(String race) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(race);
		modelPage.selectRace(race);
		
	   // throw new io.cucumber.java.PendingException();
	}


}
