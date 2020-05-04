package orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="txtUsername")
	WebElement userba;
	
	@FindBy (name="txtPassword")
	WebElement puswd;
	
	@FindBy(name="Submit")
	WebElement submit;
	//initializing the page object
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public String titlecheck() {
		return driver.getTitle();
	}
	public DashBoard logintest(String us,String pw) {
		userba.sendKeys(us);
		puswd.sendKeys(pw);
		submit.click();
		return new DashBoard();
	}
}
