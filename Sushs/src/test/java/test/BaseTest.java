package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.LogInPage;
import main.PimPage;

public class BaseTest {
	
	public static WebDriver driver;
	protected PimPage pimob;
	protected LogInPage login;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@BeforeClass
	public void objects() {
		login = new LogInPage(driver);
		pimob = new PimPage(driver);
	}

	@AfterClass
	public void terminate() {
		driver.quit();
	}
}
