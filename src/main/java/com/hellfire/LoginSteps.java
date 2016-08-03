package com.hellfire;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LoginSteps extends ScenarioSteps {

	LoginPage loginPage;

	public class EmagSteps extends ScenarioSteps {
	}

	@Step
	public void openHellFirePage(String url) {
		loginPage.getDriver().manage().window().maximize();
		loginPage.getDriver().get(url);
	}

	@Step
	public void inputUserName(String username) {
		loginPage.inputUserName(username);
	}

	@Step
	public void inputUserPass(String pass) {
		loginPage.inputUserPass(pass);
	}

	@Step
	public void clickLoginButton() {
		loginPage.clickLoginButton();
	}
	@Step
	public void clickOnMenuItem(String policiesItem){
		loginPage.clickOnMenuItem(policiesItem);
	}
	@Step
	public void policiesTitleAssertion(String policiesText){
		loginPage.policiesTitleAssertion(policiesText);
		
	}
}
