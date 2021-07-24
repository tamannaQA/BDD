package WebPages;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;




public class PersonalInfoEnterPage extends PageObject {
	
	@FindBy(id="id_fst_name")
	protected WebElementFacade fnameElement;
	
	@FindBy(id="id_lst_name")
	protected WebElementFacade lnameElement;
	
	@FindBy(tagName="select")
	protected WebElementFacade dorpdownElement;	
	
	@FindBy(css="input#id_race") 
	protected List<WebElementFacade> raceElements;	
	
	
	@FindBy(name="city")
	protected WebElementFacade cityElement;	
				
	
	//protected PersonalInfoEnterPage personalIno;
    
	public void enterFirstname(String fName)
	{
		fnameElement.sendKeys(fName);
		
		
		
	}
	
	public void enterLastname(String lName)
	{
		lnameElement.sendKeys(lName);
		
		
	}
	
	public void enterCityname(String city)
	{
		cityElement.sendKeys(city);
		
		
	}
	
	
	public void enterStateName(String state)
	{
		//dorpdownElement.isVisible()
		
		System.out.println("state: " + state);
		
		Select stateSelect = new Select(dorpdownElement);
		stateSelect.selectByVisibleText(state);
		
		
		
	}
	
	public void selectRace(String race)
	{
		System.out.println("race: " + race);
		
		System.out.println("size" + raceElements.size());
		String raceSelect="";
		for(WebElement raceElement : raceElements)
		{
			raceSelect=raceElement.getAttribute("value").trim();
			
			System.out.println("raceSelect: " + raceSelect);
		
			
			if (race.trim().equalsIgnoreCase(raceSelect))
			{
				raceElement.click();
			}
			
		}
		
		
		
	}
	
	
	

}
