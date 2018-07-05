package com.ea.dgt.generated.ui.pages;

import com.ea.dgt.generated.ui.pages.templates.DGTSiteTemplatePage;
import java.util.List;
import javax.annotation.Generated;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JasfApiClientPage extends DGTSiteTemplatePage {

	public JasfApiClientPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public String getExpectedTitle() {
		return "JASF API CLient";
	}
	
	//==============================
	// WEB ELEMENTS
	//==============================
	@Generated(value = "dropdown")
	@FindBy(css = "#id_shard > [value=OPSTEST-S1]")
	public WebElement envrionmentDropDownOpsTest;
	
	@Generated(value = "dropdown")
	@FindBy(css = "#id_shard")
	public WebElement environmentDropDownBox;
	
	@Generated(value = "text")
	@FindBy(css = "#id_url")
	public WebElement textInputUrlPath;
	
	@Generated(value = "dropdown")
	@FindBy(css = "#id_service")
	public WebElement serviceDropDownBox;
	
	@Generated(value = "dropdown")
	@FindBy(css = "//*[@id=\"id_service\"]/option[value=12]")
	public List<WebElement> servieDropDownUtas;
	
	@Generated(value = "button")
	@FindBy(css = "#go")
	public WebElement goButton;
	
	@Generated(value = "dropdown")
	@FindBy(css = "#id_shard > [value=OPSTEST-S1]")
	public WebElement shardOpstest;
	
	@Generated(value = "button")
	@FindBy(css = "#id_all_servers")
	public WebElement allServersCheckBox;
	
}
