package mainjavaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testt.BaseTest;

public class LoginPage extends BaseTest {

	
	//All the locators of page
	@FindBy(xpath="")
	WebElement txtLoginPage;
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(tagName="button")
	WebElement btnLogin;


	//Initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods required to perform test steps
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	public String titleOfLoginPage() {
		return txtLoginPage.getText();
	}
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	public void setUserName(String usrName) {
		userName.sendKeys(usrName);
	}
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 */
	
	public String getBuildTitle() {
		return driver.getTitle();
		}}























