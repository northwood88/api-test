package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthCheckLandingPage extends DGTSiteTemplatePage {

	public HealthCheckLandingPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "Health Check";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "dropdown")
	@FindBy(css = "#id_environment")
	public WebElement environmentDropDown;
	
	@Generated(value = "dropdown")
	@FindBy(css = "#id_environment > option:nth-child(39)")
	public WebElement opstestDropDown;
	
}
