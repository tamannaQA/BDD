package WebPages;



import net.serenitybdd.core.pages.PageObject;

//import com.paulhammant.ngwebdriver.ByAngularBinding.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;

public class PersonalInfoModelPage {
	
	PersonalInfoEnterPage personalEnterpage;
	

	
	
	
	@Step
	public void launchHomePage()
	{
		personalEnterpage.open();
	}
	
	@Step
	public void enterFirstname(String fname)
	{
		personalEnterpage.enterFirstname(fname);
		
		
	}
	
	@Step
	public void enterLastname(String lname)
	{
		personalEnterpage.enterLastname(lname);
		
		
	}
	
	@Step
	public void enterCityname(String city)
	{
		personalEnterpage.enterCityname(city);
		
	}
	
	
	
	@Step
	public void enterStateName(String state)
	{
		personalEnterpage.enterStateName(state);
		
	}
	
	@Step
	public void selectRace(String race)
	{
		personalEnterpage.selectRace(race);
		
	}
	
	
	

}
