package com.hellfire.policies.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

public class FiltersPage extends AbstractPage {
	
	public void clickOnPolicyFilterTypeButton(){
		WebElement filterTypeButton = getDriver().findElement(By.cssSelector("span [class*= 'ind']"));
		filterTypeButton.click();
	}

	public void policiesFilterListType(List<String> strings) {
		List<WebElement> elementsList = getDriver()
				.findElements(By.cssSelector("div[class$= 'small' ] label"));
		for (String s : strings) {
			boolean found = false;
			for (WebElement e : elementsList) {
				System.out.println("element text: " + e.getText());
				if (e.getText().contentEquals(s)) {
					e.click();
					found = true;
					break;
				}
			}
			Assert.assertTrue("text: " + s + " was not found in list", found);
			System.out.println();
		}
	}
	
	public void clickToCheckAllPolicyTypeCheckbox(String allCheckbox){
			List<WebElement> elementsList = getDriver().findElements(By.cssSelector("div[class$= 'small' ] label"));
			for (WebElement e : elementsList) {
				System.out.println("element text: " + e.getText());
				if (e.getText().contentEquals(allCheckbox)) {
					e.click();
					break;
				}
			}
		}
		
	}
	



