package com.hellfire;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LogInSteps extends ScenarioSteps {

	LogInPage logInPage;

	@Step
	public void openHellFirePage(String url) {
		logInPage.getDriver().manage().window().maximize();
		logInPage.getDriver().get(url);
	}

	@Step
	public void inputUserName(String username) {
		logInPage.inputUserName(username);
	}

	@Step
	public void inputUserPass(String pass) {
		logInPage.inputUserPass(pass);
	}

	@Step
	public void clickLoginButton() {
		logInPage.clickLoginButton();
	}
}
