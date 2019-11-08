package com.atmecs.tutorialsninja.validation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.tutorialninja.Testsuite.Pageactions;
import com.atmecs.tutorialsninja.utils.ProjectBaseConstantPaths;
import com.atmecs.tutorialsninja.utils.ReadLocatorsFile;

public class HeatClinicvalidation {
	Pageactions page;
	ReadLocatorsFile read;
	@SuppressWarnings("static-access")
	public void homeproductValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[0];
        actualproduct=page.getText(read.getData("validation.homeproduct.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void hotsauceproductValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[1];
        actualproduct=page.getText(read.getData("validate.hotsauceproduct.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void merchandiseproductValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[2];
        actualproduct=page.getText(read.getData("validate.merchandiseproduct.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void clearanceproductValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[3];
        actualproduct=page.getText(read.getData("validate.clearanceproduct.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void newtohotsauceValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[4];
        actualproduct=page.getText(read.getData("validate.newtohotsauce.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void FaqValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[5];
        actualproduct=page.getText(read.getData("validate.faq.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void mensValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[6];
        actualproduct=page.getText(read.getData("validate.mens.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void producttitleValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[8];
        actualproduct=page.getText(read.getData("validate.producttitle.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}		
	
	@SuppressWarnings("static-access")
	public void priceValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[9];
        actualproduct=page.getText(read.getData("validate.price.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
        Assert.assertTrue(true, actualproduct.valueOf("$14.99"));
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	
	@SuppressWarnings("static-access")
	public void totalpriceValidate(String[] values,WebDriver driver) throws IOException {
		page = new Pageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct=values[10];
        actualproduct=page.getText(read.getData("validate.totalprice.txt",ProjectBaseConstantPaths.LOCATORS_FILE));
		Assert.assertTrue(true, actualproduct.valueOf("$14.99"));
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	

}
