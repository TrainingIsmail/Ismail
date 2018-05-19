package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="inputBox")
	private WebElement elecname;
	
	@And("Enter the Companyname(.*)")
	public CreateLead entercname(String data) {
		type(elecname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_firstName']")
	private WebElement elefname;
	
	@And("Enter the Firstname(.*)")
	public CreateLead enterfname(String data) {
		type(elefname, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_lastName']")
	private WebElement elelname;
	
	@And("Enter the Lastname(.*)")
	public CreateLead enterlname(String data) {
		type(elelname, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elesubmitlead;
	
	@And("Click the Createlead")
	public Viewlead clicksubmitlead() {
		click(elesubmitlead);
		return new Viewlead();
	}
	
}
