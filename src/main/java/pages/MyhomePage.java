package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyhomePage extends ProjectMethods{
	
	public MyhomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	
	@And("Click on Create lead")
	public CreateLead clickcreatelead() {
		click(elecreatelead);
		return new CreateLead();		
	}

}
