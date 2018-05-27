package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LoginPagePayPal extends ProjectMethods {
	
	public LoginPagePayPal() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleselect;
	
	@And("Click the Shoppers")
	public LoginPagePayPal clickshoppers() {
		click(eleselect);
		return this;

	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleclick;
	
	@And("Click the Next")
	public InfoPayPal clicknext() {
		click(eleclick);
		return new InfoPayPal();

	}

}
