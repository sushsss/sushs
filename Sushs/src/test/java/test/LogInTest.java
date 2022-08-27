package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
	
	@Test
	public void logInTest() throws InterruptedException {
		login.logIn();
		Thread.sleep(2000);
		String data=pimob.pimPage();
		AssertJUnit.assertEquals(data,"Stories");
			
	}

}
