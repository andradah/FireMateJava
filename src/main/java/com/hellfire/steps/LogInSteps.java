package com.hellfire.steps;

import com.hellfire.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {

	private static final long serialVersionUID = 7027720591674290320L;
	LogInPage logInPage;

	@Step
	public void openHellFirePage(String url) {
		logInPage.getDriver().get(url);
		getDriver().manage().window().maximize();
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
