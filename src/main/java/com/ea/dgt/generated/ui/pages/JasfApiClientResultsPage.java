package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JasfApiClientResultsPage extends DGTSiteTemplatePage {

	public JasfApiClientResultsPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "JASF API CLient";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "block")
	@FindBy(css = "#result_detail > table > tbody > tr > td:nth-child(1)")
	public WebElement s1StatusReport;
	
	@Generated(value = "block")
	@FindBy(css = "#result_detail > table > tbody > tr:nth-child(1) > td:nth-child(2)")
	public WebElement s1Body;
	
	@Generated(value = "block")
	@FindBy(css = "table.table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1)")
	public WebElement s2StatusReport;
	
	@Generated(value = "block")
	@FindBy(css = "table.table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(1)")
	public WebElement s3StatusReport;
	
	@Generated(value = "block")
	@FindBy(css = "table.table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")
	public WebElement s2Body;
	
	@Generated(value = "block")
	@FindBy(css = "table.table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)")
	public WebElement s3Body;
	
}
