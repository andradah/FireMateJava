package com.hellfire.navigation.steps;

import com.hellfire.navigation.pages.NavigationMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


@SuppressWarnings("serial")
public class NavigationMenuSteps extends ScenarioSteps {


 NavigationMenuPage navigationMenuPage;

	
	@Step
	public void clickOnMenuItem(String policiesItem){
		navigationMenuPage.clickOnMenuItem(policiesItem);
	}
}
