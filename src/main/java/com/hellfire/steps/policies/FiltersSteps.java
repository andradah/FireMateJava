package com.hellfire.steps.policies;

import java.util.List;

import com.hellfire.pages.navigation.NavigationMenuPage;
import com.hellfire.pages.policies.FiltersPage;
import com.hellfire.pages.policies.ViewPoliciesPage;

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
		filtersPage.clickOnPoliciesFilterListType(strings);
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
	public void verifyTypeListIsOrderedAsc(List<String> listOrder) {
		filtersPage.verifyTypeListIsOrderedAsc(listOrder);
	}

	@Step
	public void verifyTypeListIsOrderedDesc(List<String> listOrder2) {
		filtersPage.verifyTypeListIsOrderedDesc(listOrder2);
	}

	// @Step
	// public void verifyListOrder(List<String> strings) {
	// filtersPage.verifyListOrder(strings);
	//
	// }

}
