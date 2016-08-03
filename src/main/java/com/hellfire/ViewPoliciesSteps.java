package com.hellfire;

import java.util.List;

import com.hellfire.policies.pages.ViewPoliciesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class ViewPoliciesSteps extends ScenarioSteps {

	ViewPoliciesPage policiesPage;

	
	@Step
	public void clickOnMenuItem(String policiesItem){
		policiesPage.clickOnMenuItem(policiesItem);
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