package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsToolLandingPage extends DGTSiteTemplatePage {

	public SettingsToolLandingPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "Setting Tool";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "dropdown")
	@FindBy(css = "#id_shard")
	public WebElement shardDropDown;
	
	@Generated(value = "dropdown")
	@FindBy(css = "#id_shard > option:nth-child(38)")
	public WebElement shardOpstest;
	
}
