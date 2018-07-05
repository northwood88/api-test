package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage extends DGTSiteTemplatePage {

	public GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "Settings Tool";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "text")
	@FindBy(css = "#create_new > form > table > tbody > tr > td > #id_form-0-sku")
	public WebElement createNewSKU;
	
	@Generated(value = "text")
	@FindBy(css = "#create_new > form > table > tbody > tr > td > #id_form-0-gameSku")
	public WebElement createNewGameSku;
	
	@Generated(value = "text")
	@FindBy(css = "#create_new > form > table > tbody > tr > td > #id_form-0-requestingSku")
	public WebElement createNewRequestingSku;
	
	@Generated(value = "text")
	@FindBy(css = "#create_new > form > table > tbody > tr > td > #id_form-0-value")
	public WebElement createNewValue;
	
	@Generated(value = "text")
	@FindBy(css = "#create_new > form > table > tbody > tr > td > #id_form-0-public_flag")
	public WebElement createNewPublicFlag;
	
	@Generated(value = "text")
	@FindBy(css = "#id_form-1-gameSku")
	public WebElement form1GameSku;
	
	@Generated(value = "text")
	@FindBy(css = "#id_form-1-requestingSku")
	public WebElement form1RequestingSku;
	
	@Generated(value = "text")
	@FindBy(css = "#id_form-1-value")
	public WebElement form1Value;
	
	@Generated(value = "text")
	@FindBy(css = "#id_form-1-public_flag")
	public WebElement form1PublicFlag;
	
	@Generated(value = "button")
	@FindBy(css = "#create_new > form > input[type=\"submit\"]:nth-child(8)")
	public WebElement createButton;
	
	@Generated(value = "block")
	@FindBy(css = "body > div:nth-child(3) > div > div > div:nth-child(3) > form > input[type=\"submit\"]:nth-child(8)")
	public WebElement updateButton;
	
	@Generated(value = "button")
	@FindBy(css = "#id_form-1-delete")
	public WebElement deleteRow2CheckBox;
	
}
