package com.ea.dgt.generated.ui.pages.templates;

import com.ea.vx.pages.template.SiteTemplate;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DGTSiteTemplatePage extends SiteTemplate {

	public DGTSiteTemplatePage(WebDriver driver) {
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
	
	@Generated(value = "button")
	@FindBy(css = "#bs-example-navbar-collapse-1 > ul > li:nth-child(10) > a")
	public WebElement settingsTool;
	
	@Generated(value = "button")
	@FindBy(css = "#bs-example-navbar-collapse-1 > ul > li:nth-child(7) > a")
	public WebElement healthCheck;
	
	@Generated(value = "button")
	@FindBy(css = "#bs-example-navbar-collapse-1 > ul > li:nth-child(1) > div > a > img")
	public WebElement logo;
	
	@Generated(value = "block")
	@FindBy(css = "#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a")
	public WebElement apiClient;
	
	@Generated(value = "button")
	@FindBy(css = "#bs-example-navbar-collapse-1 > ul > li:nth-child(13) > a")
	public WebElement drain;
	
}
