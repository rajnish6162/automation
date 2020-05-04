package orange.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orange.base.TestBase;
import orange.pages.DashBoard;
import orange.pages.LoginPage;

public class DashBoardTest extends TestBase {
	LoginPage lp;
	DashBoard db;
	
	public DashBoardTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
	initialization();
	lp=new LoginPage();
	db=lp.logintest(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=0)
	public void dashboardtitlecheck() {
		db.dashboardtitlecheck();
	}
	//@Test
	//public void 
	
	
	
}
