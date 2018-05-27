package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class SignupPaypal extends ProjectMethods {
	
	public SignupPaypal() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement elesignup;
	
	@And("Click the Signup")
	public LoginPagePayPal clicksignup() {
		click(elesignup);
		return new LoginPagePayPal();

	}
	

}
