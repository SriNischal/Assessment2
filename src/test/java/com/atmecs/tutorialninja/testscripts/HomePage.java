package com.atmecs.tutorialninja.testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.tutorialninja.Testsuite.TestBase;
import com.atmecs.tutorialninja.Testsuite.Pageactions;
import com.atmecs.tutorialsninja.utils.DataProvides;
import com.atmecs.tutorialsninja.utils.LogReport;
import com.atmecs.tutorialsninja.utils.ProjectBaseConstantPaths;
import com.atmecs.tutorialsninja.utils.ReadLocatorsFile;
import com.atmecs.tutorialsninja.utils.Propertiesfile;
import com.atmecs.tutorialsninja.utils.Waitsclass;
import com.atmecs.tutorialsninja.validation.HomePageValidation;

public class HomePage extends TestBase {
	Pageactions page;
	Propertiesfile properties;
	ReadLocatorsFile read;
	Waitsclass wait;
	HomePageValidation validate;
	LogReport log;
	String url;
	@SuppressWarnings("static-access")
	@BeforeClass
	public void before() throws IOException {
		properties=new Propertiesfile();
		log=new LogReport();
	url=properties.readConfig("url1", ProjectBaseConstantPaths.CONFIG_FILE);
	System.out.println("nischal");
	driver.get(url);
	driver.manage().window().maximize();
	log.info("Application is open...");
	}
	@SuppressWarnings("static-access")
	@Test(dataProvider = "destination", dataProviderClass = DataProvides.class)
	public void home(String[] values) throws IOException, InterruptedException {
		page=new Pageactions(driver);
		properties=new Propertiesfile();
		validate=new HomePageValidation();
		read=new ReadLocatorsFile();
		//wait=new Waitsclass();
		validate.titleValidate(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.searchtext.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
		page.sendKeys(read.readPropertiesFile("loc.searchtext.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), values[0]);
        page.clickOnElement(read.readPropertiesFile("loc.searchbutton.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.avilabilityValidation(values, driver);
        validate.productdescriptionValidation(values, driver);
        validate.priceandtaxValidation(values, driver);
        page.clickOnElement(read.readPropertiesFile("loc.addtocart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.cart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.viewcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clear(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));        
        page.sendKeys(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), values[1]);
        page.clickOnElement(read.readPropertiesFile("loc.update.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.continue.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.search.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
		page.sendKeys(read.readPropertiesFile("loc.search.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), values[2]);
		page.clickOnElement(read.readPropertiesFile("loc.searchbutton.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
		validate.avilabilityValidation(values, driver);
		validate.macproductdescriptionValidation(values, driver);
		validate.macpriceandtaxValidation(values, driver);
		page.clickOnElement(read.readPropertiesFile("loc.addcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.cart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.viewcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clear(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.sendKeys(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), values[3]);
        page.clickOnElement(read.readPropertiesFile("loc.update.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.totalValidation(values, driver);
        page.clickOnElement(read.readPropertiesFile("loc.remover.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.updatedtotalValidation(values, driver);
	}
	
}
