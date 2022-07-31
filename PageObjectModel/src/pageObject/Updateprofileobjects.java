package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Updateprofileobjects {
	
	@FindBy(xpath=("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"))
	public static WebElement Myprofile;
	
	@FindBy(xpath =("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input"))
	public static WebElement mobilenumber;
	
	@FindBy(xpath=("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[7]/td[3]/div/input"))
	public static WebElement state;
	
	@FindBy(xpath=("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[8]/td[3]/div/input"))
	public static WebElement city;
	
	@FindBy(xpath=("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"))
	public static WebElement update;
	
}
	
	
	
	
	/*public static WebElement Myprofile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));

	}
	public static WebElement mobilenumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input"));

	}
	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[7]/td[3]/div/input"));

	}
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[8]/td[3]/div/input"));

	}
	public static WebElement update(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
		*/

