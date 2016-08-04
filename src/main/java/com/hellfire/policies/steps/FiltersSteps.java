package com.hellfire.policies.steps;

import java.util.List;

import com.hellfire.navigation.pages.NavigationMenuPage;
import com.hellfire.policies.pages.FiltersPage;
import com.hellfire.policies.pages.ViewPoliciesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class FiltersSteps extends ScenarioSteps {
	ViewPoliciesPage policiesPage;
	NavigationMenuPage navigationMenuPage;
	FiltersPage filtersPage;

	@Step
	public void clickOnPolicyFilterTypeButton() {
		filtersPage.clickOnPolicyFilterTypeButton();
	}

	@Step
	public void clickOnPoliciesFilterListType(List<String> strings) {
		filtersPage.policiesFilterListType(strings);
	}

	@Step
	public void clickToCheckAllPolicyTypeCheckbox(String allCheckbox) {
		filtersPage.clickToCheckAllPolicyTypeCheckbox(allCheckbox);
	}

	@Step
	public void clickOnNameInSortDropDownMenu(String nameSort) {
		filtersPage.clickOnNameInSortDropDownMenu(nameSort);
	}

	@Step
	public void clickOnDownArrowToSort() {
		filtersPage.clickOnDownArrowToSort();
	}

	@Step
	public void clickOnUpArrowToSort() {
		filtersPage.clickOnUpArrow();
	}

	@Step
	public void verifyNameListIsOrderedAsc() {
		filtersPage.verifyNameListIsOrderedAsc();
	}

	@Step
	public void verifyNameListIsOrderedDesc() {
		filtersPage.verifyNameListIsOrderedDesc();
	}

	@Step
	public void clickOnTypeInSortDropDownMenu(String typeSort) {
		filtersPage.clickOnTypeInSortDropDownMenu(typeSort);
	}

	@Step
	public void verifyTypeListIsOrderedAscType(List<String> listOrder) {
		filtersPage.verifyTypeListIsOrderedAscType(listOrder);
	}

	@Step
	public void verifyTypeListIsOrderedDescType(List<String> listOrder2) {
		filtersPage.verifyTypeListIsOrderedDescType(listOrder2);
	}

	// @Step
	// public void verifyListOrder(List<String> strings) {
	// filtersPage.verifyListOrder(strings);
	//
	// }

}
