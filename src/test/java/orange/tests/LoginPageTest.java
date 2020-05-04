package orange.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orange.base.TestBase;
import orange.pages.DashBoard;
import orange.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void set() throws InterruptedException {
		initialization();
		Thread.sleep(4000);
		lp=new LoginPage();
	}
	@Test
	public void title() throws InterruptedException {
		Thread.sleep(4000);
		String titledetials=lp.titlecheck();
		System.out.println(titledetials);
		Assert.assertEquals(titledetials, "OrangeHRM");
	}
	@Test
	public void logintocrm() throws InterruptedException {
		Thread.sleep(4000);
		lp.logintest(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(4000);
	
		}
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
