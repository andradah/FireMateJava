package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.hellfire.LogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class US000LogInHellFireTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages()
	public Pages pages;

	@Steps
	public LogInSteps logInSteps;

	String url = "http://172.22.140.89:8014/login";
	String username = "admin";
	String pass = "admin";

	@Test
	public void LoginHellFire() {
		logInSteps.openHellFirePage(url);
		logInSteps.inputUserName(username);
		logInSteps.inputUserPass(pass);
		logInSteps.clickLoginButton();
	}
}
