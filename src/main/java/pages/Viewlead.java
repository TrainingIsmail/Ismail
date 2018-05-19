package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Viewlead extends ProjectMethods {
	
	public Viewlead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleverifyfname;
	
	public Viewlead verifyfname(String data) {
	verifyPartialText(eleverifyfname, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_lastName_sp']")
	private WebElement eleverifylname;
	
	public Viewlead verifylname(String data) {
	verifyPartialText(eleverifylname, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Company Name']")
	private WebElement eleverifycname;
	
	public Viewlead verifycName(String data) {
	verifyPartialText(eleverifycname, data);
		return this;		
	}
	

}
