package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DGTSiteTemplatePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "| Django site admin";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "text")
	@FindBy(css = "#id_username")
	public WebElement username;
	
	@Generated(value = "text")
	@FindBy(css = "#id_password")
	public WebElement password;
	
	@Generated(value = "button")
	@FindBy(css = "#login-form > div.submit-row > input[type=\"submit\"]")
	public WebElement submit;
	
}
