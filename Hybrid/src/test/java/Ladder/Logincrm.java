package Ladder;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Ladder.test;

public class Logincrm extends Baseclass {
	@Test(priority = 1)
	public void loginApp() throws InterruptedException

	{
		Loginpage lopin = PageFactory.initElements(driver, Loginpage.class);
		lopin.LoginToCrm();
	}

	@Test(priority = 2)
	public void signupapp() throws InterruptedException

	{
		Signup lopi = PageFactory.initElements(driver, Signup.class);
		lopi.signupp("chakrir166@gmail.com", "Chakri@123");

	}

	@Test(priority = 3)

	public void searchupapp() throws InterruptedException

	{
		Searchpage lopi4 = PageFactory.initElements(driver, Searchpage.class);
		lopi4.searcho("bedsheets");

	}

	@Test(priority = 4)

	public void Bedapp() throws InterruptedException

	{
		Brooms lopi5 = PageFactory.initElements(driver, Brooms.class);
		lopi5.LoginBed();

	}

	@Test(priority = 5)

	public void Bedappcart() throws InterruptedException

	{
		Booking lopi6 = PageFactory.initElements(driver, Booking.class);
		lopi6.bedlogin();

	}

	@Test(priority = 6)

	public void assertionaa() throws InterruptedException

	{
		test lopi7 = PageFactory.initElements(driver, test.class);
		lopi7.assersearcho();

	}

	@Test(priority = 7)

	public void tvappcart() throws InterruptedException

	{
		Livingroom lopi8 = PageFactory.initElements(driver, Livingroom.class);
		lopi8.tvpageoo();

	}

	@Test(priority = 8)

	public void studyapp() throws InterruptedException

	{
		Study lopi9 = PageFactory.initElements(driver, Study.class);
		lopi9.studypageo();

	}

	@Test(priority = 9)

	public void aboutapp() throws InterruptedException

	{
		pages lopia = PageFactory.initElements(driver, pages.class);
		lopia.aboutu();

	}

	@Test(priority = 10)
	public void infoapp()

	{
		Moreinfo lopioo = PageFactory.initElements(driver, Moreinfo.class);
		lopioo.moruee();

	}

}