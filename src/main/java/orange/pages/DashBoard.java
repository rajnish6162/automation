package orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.base.TestBase;

public class DashBoard extends TestBase{

	@FindBy(id="welcome")
	WebElement home;
	
	@FindBy(xpath="//input[@value='Marketplace']")
	WebElement market;
	
	@FindBy(linkText = "Admin")
	WebElement admin;
	
	@FindBy(linkText = "Recruitment")
	WebElement Recruitment;
	
	//initializing the page object
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}
	public String dashboardtitlecheck() {
		return driver.getTitle();
	}
	
	public Adminpage clickonadmin() {
		admin.click();
		return new Adminpage();
	}
	
	public RecruitmentPage clickonRecruitment() {
		Recruitment.click();
		return new RecruitmentPage();
	}
	
	
	
	
	
}
