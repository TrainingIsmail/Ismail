package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class InfoPayPal extends ProjectMethods {
	
	public InfoPayPal() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement elecountry;
	
	@And("Select the Country")
	public InfoPayPal selectcountry(String value) {
		selectDropDownUsingText(elecountry, value);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleemail;
	
	@And("Enter the Email(.*)")
	public InfoPayPal enteremail(String data) {
		type(eleemail, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;
	
	@And("Enter the Password(.*)")
	public InfoPayPal elepassword(String data) {
		type(elepassword, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement elecpassword;
	
	@And("Enter the Confirm Password(.*)")
	public InfoPayPal elecpassword(String data) {
		type(elepassword, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement elecontinue;
	
	@And("Click the Signup")
	public InfoPayPal clickcontinue() {
		click(elecontinue);
		return this;

	}
	

}
