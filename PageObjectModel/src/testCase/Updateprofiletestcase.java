package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObjects;
import pageObject.Updateprofileobjects;

public class Updateprofiletestcase {

	@Test
	public void updateprofile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		
		
		PageFactory.initElements(driver,LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.submit();
		
	
		
		PageFactory.initElements(driver, Updateprofileobjects.class);
		
		Updateprofileobjects.Myprofile.click();
		Updateprofileobjects.mobilenumber.sendKeys("9789395412");
		Updateprofileobjects.state.sendKeys("Newyork");
		Updateprofileobjects.city.sendKeys("Sterling");
		Updateprofileobjects.update.submit();
		
		
		
	}
}
		
		


		/*LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.submit(driver).submit();
		
		Updateprofileobjects.Myprofile(driver).click();
		Updateprofileobjects.mobilenumber(driver).sendKeys("9789395412");
		Updateprofileobjects.state(driver).sendKeys("Newyork");
		Updateprofileobjects.city(driver).sendKeys("Sterling");
		Updateprofileobjects.update(driver).submit();*/




	
