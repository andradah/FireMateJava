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
	public void clickOnPolicyFilterTypeButton(){
		filtersPage.clickOnPolicyFilterTypeButton();
	}
	@Step
	public void clickOnPoliciesFilterListType(List<String> strings) {
		filtersPage.policiesFilterListType(strings);
	}

	@Step
	public void clickToCheckAllPolicyTypeCheckbox(String allCheckbox){
		filtersPage.clickToCheckAllPolicyTypeCheckbox(allCheckbox);
	}
}
	

