package com.hellfire.pages.policies;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

public class ViewPoliciesPage extends AbstractPage {


	public void policiesTitleAssertion(String policies) {
		WebElement policiesTitle = getDriver().findElement(By.cssSelector("#root > div  header > span:nth-child(2)"));
		Assert.assertTrue(policiesTitle.getText().contentEquals(policies));
		System.out.println("Item title on page: " + policiesTitle.getText());

	}

	public void listAllPolicies(List<String> strings) {
		List<WebElement> elementsList = getDriver()
				.findElements(By.cssSelector("header[class$='small'] label"));
		for (String s : strings) {
			boolean found = false;
			for (WebElement e : elementsList) {
				System.out.println("element text: " + e.getText());
				if (e.getText().contentEquals(s)) {
					found = true;
					break;
				}
			}
			Assert.assertTrue("text: " + s + " was not found in list", found);
			System.out.println();
		}
	}
}
