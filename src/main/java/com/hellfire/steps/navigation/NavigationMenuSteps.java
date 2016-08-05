package com.hellfire.steps.navigation;

import com.hellfire.pages.navigation.NavigationMenuPage;

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
