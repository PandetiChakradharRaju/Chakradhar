package Ladder;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Urban.Factory;
import Ladder.ConfigDataproviders;

public class Baseclass {
	public WebDriver driver;
	public ConfigDataproviders config;
	@BeforeSuite
	public void setupsuite() throws FileNotFoundException
	{
		config=new ConfigDataproviders();
	}
	@BeforeClass
	 public void voidsetup()
	 {
		
		driver=Factory.startApplication(driver,config.getBrowser(), config.getStagingurl());

	 }
	@AfterClass
	 public void teardown() 
	 {
		Factory.quitBrowser(driver);
		 
	 }

}
