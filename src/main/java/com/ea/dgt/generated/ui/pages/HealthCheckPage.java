package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthCheckPage extends DGTSiteTemplatePage {

	public HealthCheckPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "Health Check";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "block")
	@FindBy(css = "body > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > table:nth-child(3) > tbody > tr:nth-child(2) > td.alert-success")
	public WebElement bmrS1alert;
	
	@Generated(value = "block")
	@FindBy(css = "body > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > table:nth-child(3) > tbody > tr:nth-child(2) > td.alert-warning")
	public WebElement bmrS1warning;
	
	@Generated(value = "block")
	@FindBy(css = "body > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > h3")
	public WebElement summaryViewS1Header;
	
}
