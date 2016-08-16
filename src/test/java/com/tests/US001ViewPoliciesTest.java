package com.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hellfire.steps.LogInSteps;
import com.hellfire.steps.policies.ViewPoliciesSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class US001ViewPoliciesTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages()
	public Pages pages;

	@Steps
	public ViewPoliciesSteps viewPoliciesSteps;
	@Steps
	public LogInSteps logInSteps;

	String url = "http://172.22.140.89:8014/login";
	String username = "admin";
	String pass = "admin";

	String policiesItem;
	String policiesText;
	List<String> strings = new ArrayList<String>();

	@Before
	public void dataSetup() {
		policiesItem = "Policies";
		policiesText = "Policies";
		
		strings.add("PolicyType1");
		strings.add("PolicyType2");
		strings.add("PolicyType3");
	}

	@Test
	public void us001ViewPoliciesTest() {
		logInSteps.openHellFirePage(url);
		logInSteps.inputUserName(username);
		logInSteps.inputUserPass(pass);
		logInSteps.clickLoginButton();

		viewPoliciesSteps.clickOnMenuItem(policiesItem);
		viewPoliciesSteps.policiesTitleAssertion(policiesText);
		viewPoliciesSteps.listAllPolicies(strings);

	}
}