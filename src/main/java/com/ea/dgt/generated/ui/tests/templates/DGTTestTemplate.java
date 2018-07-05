package com.ea.dgt.generated.ui.tests.templates;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.ea.vx.tests.template.WebUITestTemplate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.ea.dgt.generated.ui.pages.JasfApiClientPage;
import java.util.ArrayList;
import com.ea.vx.viu.actions.verification.ViuVerifications;
import javax.annotation.Generated;
import org.testng.Assert;
import com.ea.dgt.generated.ui.pages.HealthCheckPage;
import com.ea.vx.viu.actions.ViuActionsFactory;
import org.testng.asserts.SoftAssert;
import com.ea.vx.viu.actions.navigation.ViuNavigation;
import org.testng.ITestContext;
import com.ea.vx.viu.actions.shadow.ViuShadowDom;
import com.ea.dgt.generated.ui.pages.JasfApiClientResultsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import com.ea.vx.viu.actions.accessor.ViuAccessors;
import com.ea.dgt.generated.ui.pages.LoginPage;
import org.openqa.selenium.StaleElementReferenceException;
import java.util.List;
import com.ea.vx.pages.template.PageObject;
import com.ea.dgt.generated.ui.pages.HealthCheckLandingPage;
import com.ea.dgt.generated.ui.pages.HomePage;
import com.ea.vx.viu.actions.interaction.ViuInteractions;
import com.ea.vx.webui.controllers.VxStoreKeys;

public class DGTTestTemplate extends WebUITestTemplate {

	//==============================
	// CLASS VARIABLES
	//==============================
	
	//==============================
	// CUSTOM ACTION METHODS
	//==============================
	@Generated(value = "testMethod")
	protected <Z extends PageObject> Z login(ITestContext context, String username, String password) throws Exception {
	
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("go to login page");
	LoginPage loginPage0 = (LoginPage) goToPageByURL(context, "https://dev-lion-tools.lion.eac.ad.ea.com/", LoginPage.class);
	
		log("enter user name");
		Object keysToSend427500 = username;
		if (keysToSend427500 instanceof Double) {
			keysToSend427500 =  Double.toString( (Double) keysToSend427500);
		}
		
		interactions.sendKeys(loginPage0.username, (String) keysToSend427500);
	
		log("enter password");
		Object keysToSend067000 = password;
		if (keysToSend067000 instanceof Double) {
			keysToSend067000 =  Double.toString( (Double) keysToSend067000);
		}
		
		interactions.sendKeys(loginPage0.password, (String) keysToSend067000);
	
		log("click submit");
		HomePage homePage1 = interactions.click(loginPage0.submit, HomePage.class);
	
		return (Z) homePage1;
	}
	
	@Generated(value = "testMethod")
	protected <Z extends PageObject> Z goToHealthCheckOpstest(ITestContext context) throws Exception {
	
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("Go to URL https://dev-lion-tools.lion.eac.ad.ea.com");
	HomePage homePage0 = (HomePage) goToPageByURL(context, "https://dev-lion-tools.lion.eac.ad.ea.com", HomePage.class);
	
		log("Click Health Check on Banner");
		HealthCheckLandingPage healthCheckLandingPage1 = interactions.click(homePage0.healthCheck, HealthCheckLandingPage.class);
	
		log("click environment drop down");
		interactions.click(healthCheckLandingPage1.environmentDropDown);
	
		log("click Opstest s1");
		HealthCheckPage healthCheckPage2 = interactions.click(healthCheckLandingPage1.opstestDropDown, HealthCheckPage.class);
	
		return (Z) healthCheckPage2;
	}
	
	@Generated(value = "testMethod")
	protected <Z extends PageObject> Z jasfApiOpstestUtas(ITestContext context) throws Exception {
	
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("Starts at API page");
	JasfApiClientPage jasfApiClientPage0 = (JasfApiClientPage) goToPageByURL(context, "https://dev-lion-tools.lion.eac.ad.ea.com/apiclient", JasfApiClientPage.class);
	
		log("Click Environment dropdown");
		interactions.click(jasfApiClientPage0.environmentDropDownBox);
	
		log("click Opstest s1");
		interactions.click(jasfApiClientPage0.envrionmentDropDownOpsTest);
	
		log("click service dropdown");
		interactions.click(jasfApiClientPage0.serviceDropDownBox);
	
		log("click UTAS");
		interactions.select(jasfApiClientPage0.serviceDropDownBox, "UTAS");
	
		return (Z) jasfApiClientPage0;
	}
	
	@Generated(value = "testMethod")
	protected <Z extends PageObject> Z jasfApiParameters(ITestContext context, String urlPath, String resultStack, String resultS1Body) throws Exception {
	
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("Starts API page");
	JasfApiClientPage jasfApiClientPage0 = (JasfApiClientPage) goToPageByURL(context, "https://dev-lion-tools.lion.eac.ad.ea.com/apiclient", JasfApiClientPage.class);
	
		log("Click Environment Dropdown Box");
		interactions.click(jasfApiClientPage0.environmentDropDownBox);
	
		log("click Opstest s1");
		interactions.click(jasfApiClientPage0.envrionmentDropDownOpsTest);
	
		log("Click service dropdown box");
		interactions.click(jasfApiClientPage0.serviceDropDownBox);
	
		log("click UTAS");
		interactions.select(jasfApiClientPage0.serviceDropDownBox, "UTAS");
	
		log("input url parameter");
		Object keysToSend897400 = urlPath;
		if (keysToSend897400 instanceof Double) {
			keysToSend897400 =  Double.toString( (Double) keysToSend897400);
		}
		
		interactions.sendKeys(jasfApiClientPage0.textInputUrlPath, (String) keysToSend897400);
	
		log("Click all servers");
		interactions.click(jasfApiClientPage0.allServersCheckBox);
	
		log("Press go");
		JasfApiClientResultsPage jasfApiClientResultsPage1 = interactions.click(jasfApiClientPage0.goButton, JasfApiClientResultsPage.class);
	
		log("Verify server 1 body");
		String[] sValues718200 = resultS1Body.split("=");
		verifications.verifyAttribute(jasfApiClientResultsPage1.s1Body, sValues718200[0], sValues718200[1], "Verify server 1 body", null);
	
		return (Z) jasfApiClientResultsPage1;
	}
	
	@Generated(value = "testMethod")
	protected <Z extends PageObject> Z waitForManualSignIn(ITestContext context) throws Exception {
	
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("Go to sign in");
	LoginPage loginPage0 = (LoginPage) goToPageByURL(context, "https://dev-lion-tools.lion.eac.ad.ea.com/accounts/login/?next=/", LoginPage.class);
	
		log("set user name to rkillick");
		interactions.sendKeys(loginPage0.username, "rkillick");
	
		log("wait");
		interactions.hoverAndWait(loginPage0.submit, 20);
	
		log("click log in");
		HomePage homePage1 = interactions.click(loginPage0.submit, HomePage.class);
	
		return (Z) homePage1;
	}
	
	
}