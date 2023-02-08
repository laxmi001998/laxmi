package mainjavaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testt.BaseTest;

public class DashBoardPage extends BaseTest {
	
	//All the locators of page
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	//Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//all method on page
	
	/*
	 * Author : Lakshmi Wankhade
	 * Dte :04 Feb 2023
	 * Description : This test method use to verify dashboard page title
	 * parameter return : String
	 */
	
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
}
