package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DGTSiteTemplatePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return null;
	}
	
	@Override
	public String getExpectedRegexTitle() {
		return "(?i)(lion-gui-tools-ml)";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "block")
	@FindBy(css = "#navbar")
	public WebElement buildNumber;
	
}
