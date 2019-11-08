package com.atmecs.tutorialsninja.utils;

import org.testng.annotations.DataProvider;

public class DataProvides {

	@DataProvider(name = "destination")
	public Object[][] gethomepagedata() {
		TestDataProvider provideData = new TestDataProvider(ProjectBaseConstantPaths.EXPECTED_FILE1, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}

	@DataProvider(name = "heatclinic")
	public Object[][] getheroingdata() {
		TestDataProvider provideData = new TestDataProvider(ProjectBaseConstantPaths.EXPECTED_FILE1, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}
}
