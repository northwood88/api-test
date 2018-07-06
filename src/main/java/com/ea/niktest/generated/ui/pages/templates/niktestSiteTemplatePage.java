package com.ea.niktest.generated.ui.pages.templates;

import com.ea.vx.pages.template.SiteTemplate;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class niktestSiteTemplatePage extends SiteTemplate {

	public niktestSiteTemplatePage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	
	// Added to allow a faked return value for Shadow Dom-related functions
	@Generated(value = "block")
	@FindBy(css = "not.a.real.selector")
	public WebElement fakeElement;
	
}
