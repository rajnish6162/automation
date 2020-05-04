package orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import orange.utils.TestUtils;

public class TestBase {
	public static WebDriver driver;//driver object refrence variable hai
	public static Properties prop;//prop --> elegible sb k liye static aur public v to hai

	public TestBase() {
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Uday\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\orange\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//37109717444  
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\PC software\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
