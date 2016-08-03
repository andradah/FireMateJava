package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hellfire.LogInSteps;
import com.hellfire.policies.steps.FiltersSteps;
import com.hellfire.policies.steps.ViewPoliciesSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class US002FilterPoliciesTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages()
	public Pages pages;

	@Steps
	public ViewPoliciesSteps viewPoliciesSteps;
	@Steps
	public LogInSteps logInSteps;
	@Steps 
	FiltersSteps filtersSteps;

	String url = "http://172.22.140.89:8014/login";
	String username = "admin";
	String pass = "admin";
	
	

	String policiesItem;
	String policiesText;
	List<String> policiesFilterTypes = new ArrayList<String>();
	String allCheckbox;
	
	@Before
	public void dataSetup() {
		policiesItem = "Policies";
		policiesText = "Policies";
		policiesFilterTypes.add("All");
		policiesFilterTypes.add("Workspace1");
		policiesFilterTypes.add("Workspace2");
		policiesFilterTypes.add("Workspace3");
		policiesFilterTypes.add("Workspace4");
		policiesFilterTypes.add("Workspace5");
		policiesFilterTypes.add("Workspace6");
		policiesFilterTypes.add("Workspace7");
		policiesFilterTypes.add("Workspace8");
		policiesFilterTypes.add("Workspace9");
		policiesFilterTypes.add("Workspace10");
		policiesFilterTypes.add("Workspace11");
		policiesFilterTypes.add("Workspace12");
		allCheckbox = "All";
	}
		@Test
		public void filterPoliciesTest(){
		logInSteps.openHellFirePage(url);
		logInSteps.inputUserName(username);
		logInSteps.inputUserPass(pass);
		logInSteps.clickLoginButton();
		
		viewPoliciesSteps.clickOnMenuItem(policiesItem);
		filtersSteps.clickOnPolicyFilterTypeButton();
		filtersSteps.clickOnPoliciesFilterListType(policiesFilterTypes);
		filtersSteps.clickToCheckAllPolicyTypeCheckbox(allCheckbox);
		
		
		
		
}
}