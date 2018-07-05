package com.ea.dgt.generated.ui.tests;

import com.ea.dgt.generated.ui.pages.SettingsToolLandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.ea.dgt.generated.ui.pages.JasfApiClientPage;
import com.ea.dgt.generated.ui.tests.templates.DGTTestTemplate;
import com.ea.dgt.generated.ui.pages.ToolRedirectionPage;
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
import com.ea.dgt.generated.ui.pages.GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import com.ea.vx.viu.actions.accessor.ViuAccessors;
import java.util.List;
import com.ea.vx.pages.template.PageObject;
import com.ea.dgt.generated.ui.pages.HomePage;
import com.ea.vx.viu.actions.interaction.ViuInteractions;
import com.ea.vx.webui.controllers.VxStoreKeys;
import com.ea.dgt.generated.ui.pages.DrainPage;

public class DGTDevTest extends DGTTestTemplate {

	//==============================
	// CLASS VARIABLES
	//==============================
	
	@Generated(value = "testMethod")
	@Test(enabled = false, groups = {"generated", "ui", "regression"})
	public void apiWrapper (ITestContext context) throws Exception {
	
		log("");
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("login");
		HomePage homePage0 = waitForManualSignIn(context);
	
		log("click on JASF API tool link");
		JasfApiClientPage jasfApiClientPage1 = interactions.click(homePage0.apiClient, JasfApiClientPage.class);
	
		log("click on environment dropdown");
		interactions.click(jasfApiClientPage1.environmentDropDownBox);
	
		log("Click on Utas");
		interactions.click(jasfApiClientPage1.envrionmentDropDownOpsTest);
	
		log("Click on Service dropdown");
		interactions.click(jasfApiClientPage1.serviceDropDownBox);
	
		log("Click on Utas");
		interactions.select(jasfApiClientPage1.serviceDropDownBox, "UTAS");
	
		log("input /ut/settings into text box");
		interactions.sendKeys(jasfApiClientPage1.textInputUrlPath, "/ut/admin/settings");
	
		log("go");
		ToolRedirectionPage toolRedirectionPage2 = interactions.click(jasfApiClientPage1.goButton, ToolRedirectionPage.class);
	
		log("Verify user ends up on the redirection page");
		verifications.verifyDisplayedText(toolRedirectionPage2.body, "You are being redirected to the offical tool manage this feature in 5 seconds. Please click this link if the redirection does not work /features_tool", "Verify user ends up on the redirection page", null);
	
	}
	
	@Generated(value = "testMethod")
	@Test(enabled = false, groups = {"generated", "ui", "regression"})
	public void settingsToolAuditWIP (ITestContext context) throws Exception {
	
		log("");
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("log in");
		HomePage homePage0 = waitForManualSignIn(context);
	
		log("Clicking on settings tool");
		SettingsToolLandingPage settingsToolLandingPage1 = interactions.click(homePage0.settingsTool, SettingsToolLandingPage.class);
	
		log("click shard dropdown");
		interactions.click(settingsToolLandingPage1.shardDropDown);
	
		log("click Opstest s1");
		interactions.click(settingsToolLandingPage1.shardOpstest);
	
	}
	
	@Generated(value = "testMethod")
	@Test(enabled = false, groups = {"generated", "ui", "regression", "smoke"})
	public void healthCheckCompleted (ITestContext context) throws Exception {
	
		log("");
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("manual log in");
		HomePage homePage0 = waitForManualSignIn(context);
	
		log("go to https://dev-lion-tools.lion.eac.ad.ea.com/health_check_env?environment=35");
		String pageUrl887500 = "https://dev-lion-tools.lion.eac.ad.ea.com/health_check_env?environment=35";
		String baseUrl884300 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl887500 = baseUrl884300 + "health_check_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl887500));
		HealthCheckPage healthCheckPage1 = goToPageByURL(context, pageUrl887500, HealthCheckPage.class);
	
		log("Verify user is on Opstest");
		verifications.verifyDisplayedText(healthCheckPage1.summaryViewS1Header, "Summary view OPSTEST-S1", "Verify user is on Opstest", null);
	
		log("check BMR alive");
		verifications.verifyDisplayedText(healthCheckPage1.bmrS1alert, "I am alive", "check BMR alive", null);
	
		log("go to Drain! Opstest");
		String pageUrl427900 = "https://dev-lion-tools.lion.eac.ad.ea.com/drain_env?environment=35";
		String baseUrl425800 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl427900 = baseUrl425800 + "drain_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl427900));
		DrainPage drainPage2 = goToPageByURL(context, pageUrl427900, DrainPage.class);
	
		log("click BMR S1");
		interactions.click(drainPage2.opstest1CheckboxHardBMR1);
	
		log("click apply");
		DrainPage drainPage3 = interactions.click(drainPage2.applyDrain, DrainPage.class);
	
		log("Go to drain to refresh page");
		String pageUrl324100 = "https://dev-lion-tools.lion.eac.ad.ea.com/drain_env?environment=35";
		String baseUrl322000 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl324100 = baseUrl322000 + "drain_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl324100));
		DrainPage drainPage4 = goToPageByURL(context, pageUrl324100, DrainPage.class);
	
		log("check am Drained");
		verifications.verifyDisplayedTextContains(drainPage4.bmrS1drainStatus, "I am drained", "check am Drained", null);
	
		log("go to healthcheck");
		String pageUrl143100 = "https://dev-lion-tools.lion.eac.ad.ea.com/health_check_env?environment=35";
		String baseUrl139800 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl143100 = baseUrl139800 + "health_check_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl143100));
		HealthCheckPage healthCheckPage5 = goToPageByURL(context, pageUrl143100, HealthCheckPage.class);
	
		log("verify drain status in health check");
		verifications.verifyDisplayedText(healthCheckPage5.bmrS1warning, "I am drained", "verify drain status in health check", null);
	
		log("go to drain! opstest");
		String pageUrl376000 = "https://dev-lion-tools.lion.eac.ad.ea.com/drain_env?environment=35";
		String baseUrl366500 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl376000 = baseUrl366500 + "drain_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl376000));
		DrainPage drainPage6 = goToPageByURL(context, pageUrl376000, DrainPage.class);
	
		log("click BMR checkbox");
		interactions.click(drainPage6.opstest1CheckboxHardBMR1);
	
		log("Apply button to drain");
		DrainPage drainPage7 = interactions.click(drainPage6.applyDrain, DrainPage.class);
	
		log("go to drain to refresh page");
		String pageUrl106600 = "https://dev-lion-tools.lion.eac.ad.ea.com/drain_env?environment=35";
		String baseUrl104500 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl106600 = baseUrl104500 + "drain_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl106600));
		DrainPage drainPage8 = goToPageByURL(context, pageUrl106600, DrainPage.class);
	
		log("verify BMR is alive on Drain page");
		verifications.verifyDisplayedText(drainPage8.bmrS1drainStatus, "I am alive", "verify BMR is alive on Drain page", null);
	
		log("go to health check via https://dev-lion-tools.lion.eac.ad.ea.com/health_check_env?environment=35");
		String pageUrl258300 = "https://dev-lion-tools.lion.eac.ad.ea.com/health_check_env?environment=35";
		String baseUrl255500 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl258300 = baseUrl255500 + "health_check_env" + "?environment=35";
		
		log(String.format("Navigating to %s", pageUrl258300));
		HealthCheckPage healthCheckPage9 = goToPageByURL(context, pageUrl258300, HealthCheckPage.class);
	
		log("verify BMR is back baby");
		verifications.verifyDisplayedText(healthCheckPage9.bmrS1alert, "I am alive", "verify BMR is back baby", null);
	
		log("Go to API Opstest - UTAs");
		JasfApiClientPage jasfApiClientPage10 = jasfApiOpstestUtas(context);
	
		log("input /ut/healthcheck");
		interactions.sendKeys(jasfApiClientPage10.textInputUrlPath, "/ut/healthcheck");
	
		log("Press update");
		JasfApiClientResultsPage jasfApiClientResultsPage11 = interactions.click(jasfApiClientPage10.goButton, JasfApiClientResultsPage.class);
	
		log("Verify 200");
		verifications.verifyDisplayedText(jasfApiClientResultsPage11.s1StatusReport, "200", "Verify 200", null);
	
	}
	
	@Generated(value = "testMethod")
	@Test(groups = {"generated", "ui", "regression"})
	public void settingsTool (ITestContext context) throws Exception {
	
		log("https://dev-lion-tools.lion.eac.ad.ea.com/");
	        //fetch web driver
	        WebDriver driver = getWebDriver(context, VxStoreKeys.fetchSingleWebDriverKey());
	
	        //instantiate viu actions
	        ViuInteractions interactions = ViuActionsFactory.getInstance().getViuInteractions(driver);
	        ViuVerifications verifications = ViuActionsFactory.getInstance().getViuVerifications(driver);
	        ViuShadowDom shadowDom = ViuActionsFactory.getInstance().getViuShadowDom(driver);
	        ViuNavigation navigation = ViuActionsFactory.getInstance().getViuNavigation(driver);
	        ViuAccessors accessors = ViuActionsFactory.getInstance().getViuAccessors(driver);
	
		SoftAssert softAssert = new SoftAssert();
	
		log("wait for credentials");
		HomePage homePage0 = waitForManualSignIn(context);
	
		log("go to dev-lion-tools.lion.eac.ad.ea.com/settings_tool/gdbEnabled?shard=OPSTEST-S1&service=12&setting_name=drilldown");
		String pageUrl097400 = "https://dev-lion-tools.lion.eac.ad.ea.com/settings_tool/gdbEnabled?shard=OPSTEST-S1&service=12&setting_name=drilldown";
		String baseUrl093400 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl097400 = baseUrl093400 + "settings_tool/gdbEnabled" + "?shard=OPSTEST-S1&service=12&setting_name=drilldown";
		
		log(String.format("Navigating to %s", pageUrl097400));
		GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1 = goToPageByURL(context, pageUrl097400, GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage.class);
	
		log("Stop Test if row 2 exists");
		verifications.verifyIsNotDisplayed(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.deleteRow2CheckBox, 0, "Stop Test if row 2 exists", null);
	
		log("input create gamesku = FFA16PS4");
		interactions.sendKeys(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.createNewGameSku, "FFA16PS4");
	
		log("input requesting SKU = FFA16PS4");
		interactions.sendKeys(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.createNewRequestingSku, "FFA16PS4");
	
		log("input Value = 1");
		interactions.sendKeys(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.createNewValue, "1");
	
		log("input public flag = 1");
		interactions.sendKeys(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.createNewPublicFlag, "1");
	
		log("press create");
		GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage2 = interactions.click(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage1.createButton, GdbEnabledshardOPSTESTS1service12settingnamedrilldownPage.class);
	
		log("verify gamesku is FFA16PS4");
		String[] sValues484000 = "value=FFA16PS4".split("=");
		verifications.verifyAttribute(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage2.form1GameSku, sValues484000[0], sValues484000[1], "verify gamesku is FFA16PS4", null);
	
		log("verify requesting SKU is FFA16PS4");
		String[] sValues063900 = "value=FFA16PS4".split("=");
		verifications.verifyAttribute(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage2.form1RequestingSku, sValues063900[0], sValues063900[1], "verify requesting SKU is FFA16PS4", null);
	
		log("verify Value is 1");
		String[] sValues535900 = "value=1".split("=");
		verifications.verifyAttribute(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage2.form1Value, sValues535900[0], sValues535900[1], "verify Value is 1", null);
	
		log("verify public flag is 1");
		String[] sValues081200 = "value=1".split("=");
		verifications.verifyAttribute(gdbEnabledshardOPSTESTS1service12settingnamedrilldownPage2.form1PublicFlag, sValues081200[0], sValues081200[1], "verify public flag is 1", null);
	
		log("go to Jasf API");
		String pageUrl166500 = "https://dev-lion-tools.lion.eac.ad.ea.com/apiclient";
		String baseUrl164500 = context.getCurrentXmlTest().getParameter(getBaseURLEnv(context));
		pageUrl166500 = baseUrl164500 + "apiclient" + "";
		
		log(String.format("Navigating to %s", pageUrl166500));
		JasfApiClientPage jasfApiClientPage3 = goToPageByURL(context, pageUrl166500, JasfApiClientPage.class);
	
		log("Click Opstest");
		interactions.select(jasfApiClientPage3.environmentDropDownBox, "OPSTEST-S1");
	
		log("select UTAS");
		interactions.select(jasfApiClientPage3.serviceDropDownBox, "UTAS");
	
		log("input URL path");
		interactions.sendKeys(jasfApiClientPage3.textInputUrlPath, "/ut/admin/settings/gameSku/FFA16PS4/requestingSku/FFA16PS4/key/gdbEnabled");
	
		log("all servers");
		interactions.click(jasfApiClientPage3.allServersCheckBox);
	
		log("go button");
		JasfApiClientResultsPage jasfApiClientResultsPage4 = interactions.click(jasfApiClientPage3.goButton, JasfApiClientResultsPage.class);
	
		log("validate s1 status report 200");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s1StatusReport, "200", "validate s1 status report 200", softAssert);
	
		log("validate body");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s1Body, "*value*1*key*gdbEnabled*publicFlag*inherited*false*gameSku*FFA16PS4*requestingSku*FFA16PS4*", "validate body", softAssert);
	
		log("verify s2 status report");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s2StatusReport, "200", "verify s2 status report", softAssert);
	
		log("verify s2 body");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s2Body, "*value*1*key*gdbEnabled*publicFlag*inherited*false*gameSku*FFA16PS4*requestingSku*FFA16PS4*", "verify s2 body", softAssert);
	
		log("verify s3 status");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s3StatusReport, "200", "verify s3 status", softAssert);
	
		log("verify s3 body");
		verifications.verifyDisplayedText(jasfApiClientResultsPage4.s3Body, "*value*1*key*gdbEnabled*publicFlag*inherited*false*gameSku*FFA16PS4*requestingSku*FFA16PS4*", "verify s3 body", softAssert);
	
		softAssert.assertAll();
	}
	
}