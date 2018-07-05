package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrainPage extends DGTSiteTemplatePage {

	public DrainPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "Drain!";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "button")
	@FindBy(css = "#OPSTEST-S1_checkbox_hard_BMR_1")
	public WebElement opstest1CheckboxHardBMR1;
	
	@Generated(value = "button")
	@FindBy(css = "#button_drain")
	public WebElement applyDrain;
	
	@Generated(value = "block")
	@FindBy(css = "body > div:nth-child(3) > div > div > div > table:nth-child(6) > tbody > tr > th:nth-child(2) > ul > li > ul > li:nth-child(2) > ul > li:nth-child(1) > font")
	public WebElement bmrS1drainStatus;
	
}
