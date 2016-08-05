package com.hellfire.pages.navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

public class NavigationMenuPage extends AbstractPage{
	private String policiesItem = "nav[class*='menu'] a";

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
	
}
