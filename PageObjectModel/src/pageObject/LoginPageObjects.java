package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPageObjects {
	
	@FindBy(name= "email")
	public static WebElement username;
	@FindBy (name="password")
	public static WebElement password;
	@FindBy (xpath = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;
}
	
	
	
	
	
	/*@Test
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("email"));
		
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
		
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		
	}*/

