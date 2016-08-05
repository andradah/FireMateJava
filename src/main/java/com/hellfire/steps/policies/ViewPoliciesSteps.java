package com.hellfire.steps.policies;

import java.util.List;

import com.hellfire.pages.navigation.NavigationMenuPage;
import com.hellfire.pages.policies.ViewPoliciesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class ViewPoliciesSteps extends ScenarioSteps {

	ViewPoliciesPage policiesPage;
	NavigationMenuPage navigationMenuPage;
	
	@Step
	public void clickOnMenuItem(String policiesItem){
		navigationMenuPage.clickOnMenuItem(policiesItem);
	}
	@Step
	public void policiesTitleAssertion(String policiesText){
		policiesPage.policiesTitleAssertion(policiesText);
		
	}
	@Step
	public void listAllPolicies(List<String> strings) {
		policiesPage.listAllPolicies(strings);
	}
}
