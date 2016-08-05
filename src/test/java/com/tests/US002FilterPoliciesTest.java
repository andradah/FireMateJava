package com.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hellfire.steps.LogInSteps;
import com.hellfire.steps.policies.FiltersSteps;
import com.hellfire.steps.policies.ViewPoliciesSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class US002FilterPoliciesTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
//	@ManagedPages()
//	public Pages pages;

	@Steps
	public ViewPoliciesSteps viewPoliciesSteps;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public FiltersSteps filtersSteps;

	String url = "http://172.22.140.89:8014/login";
	String username = "admin";
	String pass = "admin";

	String policiesItem;
	String policiesText;
	List<String> policiesFilterTypes = new ArrayList<String>();
	String allCheckbox;
	String nameSort;
	List<String> listOrder = new ArrayList<String>();
	List<String> listOrder2 = new ArrayList<String>();
	String typeSort;

	@Before
	public void dataSetup() {
		policiesItem = "Policies";
		policiesText = "Policies";
		policiesFilterTypes.add("All");
		policiesFilterTypes.add("Type1");
		policiesFilterTypes.add("Type2");
		policiesFilterTypes.add("Type3");
		
		allCheckbox = "All";
		nameSort = "Name";
		typeSort = "Type";

		listOrder.add("Type1");
		listOrder.add("Type2");
		listOrder.add("Type3");

		listOrder2.add("Type3");
		listOrder2.add("Type2");
		listOrder2.add("Type1");

	}

	@Test
	public void us002FilterPoliciesTest() {
		logInSteps.openHellFirePage(url);
		logInSteps.inputUserName(username);
		logInSteps.inputUserPass(pass);
		logInSteps.clickLoginButton();

		viewPoliciesSteps.clickOnMenuItem(policiesItem);
		filtersSteps.clickOnPolicyFilterTypeButton();
		
		filtersSteps.clickOnPoliciesFilterListType(policiesFilterTypes);
		filtersSteps.clickToCheckAllPolicyTypeCheckbox(allCheckbox);
		filtersSteps.clickOnNameInSortDropDownMenu(nameSort);
		filtersSteps.clickOnPoliciesFilterListType(policiesFilterTypes);
		filtersSteps.clickToCheckAllPolicyTypeCheckbox(allCheckbox);
		filtersSteps.clickOnDownArrowToSort();
		filtersSteps.verifyNameListIsOrderedAsc();
		filtersSteps.clickOnUpArrowToSort();
		filtersSteps.verifyNameListIsOrderedDesc();
		filtersSteps.clickOnTypeInSortDropDownMenu(typeSort);
		filtersSteps.clickOnDownArrowToSort();
		filtersSteps.verifyTypeListIsOrderedAsc(listOrder);
		filtersSteps.clickOnUpArrowToSort();
		filtersSteps.verifyTypeListIsOrderedDesc(listOrder2);

	}
}