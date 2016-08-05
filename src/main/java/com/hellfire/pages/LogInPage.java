package com.hellfire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

public class LogInPage extends AbstractPage {

	private String userNameInputLocator = "input#username";
	private String userPassInputLocator = "input#password";
	private String loginButtonLocator = "input#submit";
	

	public void performLogin(String userName, String userPass) {
		inputUserName(userName);
		inputUserPass(userPass);
		clickLoginButton();
	}

	public void inputUserName(String userName) {
		element(By.cssSelector(userNameInputLocator)).waitUntilVisible();
		WebElement userNameInput = getDriver().findElement(By.cssSelector(userNameInputLocator));
		userNameInput.sendKeys(userName);
	}

	public void inputUserPass(String userPass) {
		element(By.cssSelector(userPassInputLocator)).waitUntilVisible();
		WebElement passInput = getDriver().findElement(By.cssSelector(userPassInputLocator));
		passInput.sendKeys(userPass);
	}

	public void clickLoginButton() {
		element(By.cssSelector(loginButtonLocator)).waitUntilVisible();
		WebElement loginButton = getDriver().findElement(By.cssSelector(loginButtonLocator));
		loginButton.click();
	}
}

	