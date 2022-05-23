package Ladder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Ladder.Helperclass;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver )
	{
		this.driver =driver;
	}

	@FindBy(xpath = "//li//span[@class='header-icon-link user-profile-icon']")
	WebElement login;

	public void LoginToCrm() throws InterruptedException {
		Thread.sleep(2000);
		login.click();

		Thread.sleep(2000);
		Helperclass.captureScreenshots(driver);

	}
}
