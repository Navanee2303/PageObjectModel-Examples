package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObjects;

public class Login {

	@Test
	public void LogintoPHP() {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		
		PageFactory.initElements(driver,LoginPageObjects.class);

		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.submit();
		
	}
}
		
		/*LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.submit(driver).submit();*/
			
		
		
		
		/*WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		submit.click();*/
		
		

