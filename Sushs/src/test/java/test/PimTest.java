package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	@BeforeMethod 
	public void Login() throws InterruptedException {
		login.logIn();
		Thread.sleep(2000);
	}
	@Test
	public void pimPage() {
		pimob.pimPage();
		}

}
