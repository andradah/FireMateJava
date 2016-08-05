package com.tools;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class AbstractPage extends PageObject{
	public boolean areItemsSortedAlphabetically(String message, List<WebElement> list, String ascDesc) {
		List<String> stringsList = new ArrayList<String>();
		for (WebElement e : list) {
			stringsList.add(e.getText());
		}
		if (ascDesc.contentEquals("ASC")) {
			for (int i = 1; i < list.size(); i++) {
				 System.out.println("current: " + stringsList.get(i));
				 System.out.println("previous: " + stringsList.get(i - 1));
				if (stringsList.get(i - 1).compareToIgnoreCase(stringsList.get(i)) > 0) {
					return false;
				}
			}
			return true;
		}
		if (ascDesc.contentEquals("DESC")) {
			for (int i = 1; i < list.size(); i++) {
				System.out.println("current: " + stringsList.get(i));
				 System.out.println("previous: " + stringsList.get(i - 1));
				if (stringsList.get(i - 1).compareToIgnoreCase(stringsList.get(i)) < 0) {
					return false;
				}
			}
			return true;
		}
		return false;
}

//	public void navigateTo(String URL) {
//		getDriver().get(URL);
//	}
//	
}
