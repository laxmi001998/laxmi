package testt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjavaa.BaseClass;
import mainjavaa.DashBoardPage;
import mainjavaa.LoginPage;

public class BaseTest  extends BaseClass {

	@BeforeClass
	public void initBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		dashBoardPage = new DashBoardPage(driver);
	}

	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}

