package com.atmecs.tutorialninja.testscripts;

import java.io.IOException;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.tutorialninja.Testsuite.Pageactions;
import com.atmecs.tutorialninja.Testsuite.TestBase;
import com.atmecs.tutorialsninja.utils.DataProvides;
import com.atmecs.tutorialsninja.utils.LogReport;
import com.atmecs.tutorialsninja.utils.ProjectBaseConstantPaths;
import com.atmecs.tutorialsninja.utils.Propertiesfile;
import com.atmecs.tutorialsninja.utils.ReadLocatorsFile;
import com.atmecs.tutorialsninja.utils.Waitsclass;
import com.atmecs.tutorialsninja.validation.HeatClinicvalidation;

public class HeatClinic extends TestBase{
	Pageactions page;
	Propertiesfile properties;
	String url;
	ReadLocatorsFile read;
	Waitsclass wait;
	LogReport log;
	HeatClinicvalidation validate;
	@SuppressWarnings("static-access")
	@BeforeClass
	public void before() throws IOException {
		properties=new Propertiesfile();
		log=new LogReport();
	url=properties.readConfig("url2", ProjectBaseConstantPaths.CONFIG_FILE);
	System.out.println("nischal");
	driver.get(url);
	driver.manage().window().maximize();
	log.info("Application is open...");
	}
	@SuppressWarnings("static-access")
	@Test(dataProvider = "heatclinic", dataProviderClass = DataProvides.class)
	public void heatclinic(String[] values) throws IOException, InterruptedException {
		validate=new HeatClinicvalidation();
		page=new Pageactions(driver);
		read=new ReadLocatorsFile();
		wait=new Waitsclass();
		page.clickOnElement(read.readPropertiesFile("loc.home.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.homeproductValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.hotsauces.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.hotsauceproductValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.merchandise.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.merchandiseproductValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.clearance.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.clearanceproductValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.newtohotsauce.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.newtohotsauceValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.faq.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.FaqValidate(values, driver);
		page.mouseOn(read.readPropertiesFile("loc.merchandise.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		page.clickOnElement(read.readPropertiesFile("loc.mens.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		validate.mensValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.product.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		page.clickOnElement(read.readPropertiesFile("loc.red.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		page.clickOnElement(read.readPropertiesFile("loc.medium.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		page.sendKeys(read.readPropertiesFile("loc.personalizwdname.txt", ProjectBaseConstantPaths.LOCATORS_FILE), values[7]);
		page.clickOnElement(read.readPropertiesFile("loc.buynow.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		Thread.sleep(5000);
		page.clickOnElement(read.readPropertiesFile("loc.cart.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
		log.info("done");
		//validate.producttitleValidate(values, driver);
		//validate.priceValidate(values, driver);
		//validate.totalpriceValidate(values, driver);
		page.clear(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE));
		page.sendKeys(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE), values[11]);
		page.clickOnElement(read.readPropertiesFile("loc.update.btn", ProjectBaseConstantPaths.LOCATORS_FILE));
	}

}
