package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hellfire.LoginSteps;

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
	public LoginSteps loginSteps;

	String url = "http://172.22.140.89:8014/login";
	String policiesItem = "Policies";
	String policiesText = "Policies";

	@Test
	public void policiesMenuItem() {
		loginSteps.openHellFirePage(url);
		loginSteps.clickOnMenuItem(policiesItem);
		loginSteps.policiesTitleAssertion(policiesText);
		
	}
}