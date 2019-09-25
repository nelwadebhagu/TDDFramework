package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
	}
	
	@Test
	public void TC_01()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
}
