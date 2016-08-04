package com.hellfire.policies.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tools.AbstractPage;

public class FiltersPage extends AbstractPage {

	public void clickOnPolicyFilterTypeButton() {
		WebElement filterTypeButton = getDriver().findElement(By.cssSelector("span [class*= 'ind']"));
		filterTypeButton.click();
	}

	public void policiesFilterListType(List<String> strings) {
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector("div[class$= 'small' ] label"));
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

	public void clickToCheckAllPolicyTypeCheckbox(String allCheckbox) {
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector("div[class$= 'small' ] label"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
			if (e.getText().contentEquals(allCheckbox)) {
				e.click();
				break;
			}
		}
	}

	public void clickOnSortDropDownMenuButton() {
		WebElement sortDropDownMenuButton = getDriver().findElement(By.cssSelector("select.flex"));
		sortDropDownMenuButton.click();
	}

	public void clickOnNameInSortDropDownMenu(String nameSort) {
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector("select.flex option"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
			if (e.getText().contentEquals(nameSort)) {
				e.click();
				break;
			}
		}
	}

	public void clickOnDownArrowToSort() {
		WebElement downArrowToSort = getDriver().findElement(By.cssSelector("svg[class*='down']"));
		downArrowToSort.click();
		waitABit(2000);
	}

	public void verifyNameListIsOrderedDesc() {
		List<WebElement> elemlist = getDriver().findElements(By.cssSelector("div[class*='grommetux-tile'] div strong"));
		Assert.assertTrue(areItemsSortedAlphabetically("items were not sorted descendent", elemlist, "DESC"));

	}

	public void clickOnUpArrow() {
		WebElement upArrowToSort = getDriver().findElement(By.cssSelector("svg[class*='up']"));
		upArrowToSort.click();
		waitABit(2000);
	}

	public void verifyNameListIsOrderedAsc() {
		List<WebElement> elemlist = getDriver().findElements(By.cssSelector("div[class*='grommetux-tile'] div strong"));
		Assert.assertTrue(areItemsSortedAlphabetically("items were not sorted descendent", elemlist, "ASC"));
	}

	public void clickOnTypeInSortDropDownMenu(String nameSort) {
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector("select.flex option"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
			if (e.getText().contentEquals(nameSort)) {
				e.click();
				break;

			}
		}
	}

	public void verifyTypeListIsOrderedAscType(List<String> listOrder) {
		List<WebElement> elementsList = getDriver()
				.findElements(By.cssSelector("header[class*='grommetux-box'] label"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
		}
		Assert.assertTrue(listOrder.equals(elementsList));
		return;

	}

	public void verifyTypeListIsOrderedDescType(List<String> listOrder2) {
		List<WebElement> elementsList = getDriver()
				.findElements(By.cssSelector("header[class*='grommetux-box'] label"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
		}
		Assert.assertTrue(listOrder2.equals(elementsList));
		return;
	}
}
