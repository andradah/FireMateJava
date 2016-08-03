package com.hellfire;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

public class LoginPage extends AbstractPage {

	private String userNameInputLocator = "input#username";
	private String userPassInputLocator = "input#password";
	private String loginButtonLocator = "input#submit";
	private String policiesItem = "nav[class*='menu'] a";

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

	public void clickOnMenuItem(String elementText) {
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector(policiesItem));
		for (WebElement e : elementsList) {
			System.out.println("menu item : " + e.getText());
			if (e.getText().contentEquals(elementText)) {
				e.click();

				break;
			}
		}
	}

	public void policiesTitleAssertion(String policies) {
		WebElement policiesTitle = getDriver().findElement(By.cssSelector("#root > div  header > span:nth-child(2)"));
		Assert.assertTrue(policiesTitle.getText().contentEquals(policies));
		System.out.println("Item title on page: " + policiesTitle.getText());

	}
}
