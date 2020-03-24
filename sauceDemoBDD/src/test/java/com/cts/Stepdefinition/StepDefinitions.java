package com.cts.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.AboutPage;
import com.cts.pages.CareerPage;
import com.cts.pages.LoginPage;
import com.cts.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver;

	@Given("I have browser with SauceDemo Test")
	public void i_have_browser_with_SauceDemo_Test() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String username, String password) {

		// username
		LoginPage.enterUsername(driver, username);

		// password
		LoginPage.enterPassword(driver, password);

		// login
		LoginPage.clickOnLogin(driver);
	}

	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String expectedTitle) {

		String actualTitle = LoginPage.getTitle(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("I click on Menu button")
	public void i_click_on_Menu_button() {

ProductsPage.clickOnMenuBar(driver);
	}

	@Then("I side menu with about button has to appear")
	public void i_side_menu_with_about_button_has_to_appear() {
		ProductsPage.WaitForAbout(driver);
	}

	@When("I click on About")
	public void i_click_on_About() {
		ProductsPage.clickOnAbout(driver);
	}

	@Then("application is redirected to page with title as {string}")
	public void application_is_redirected_to_page_with_title_as(String expectedTitle) {
		String actualTitle = ProductsPage.getTitle(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("I click on Company")
	public void i_click_on_Company() {
		AboutPage.company(driver);
	}

	@Then("a list with About Us option must open")
	public void a_list_with_careers_option_must_open() {
		AboutPage.waitForCareers(driver);
	}

	@When("click on careers")
	public void click_on_careers() {
		AboutPage.career(driver);
	}

	@Then("career page with title {string} has to open")
	public void career_page_with_title_has_to_open(String expectedTitle) {
		String actualTitle = AboutPage.getTitle(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("I click on Search button")
	public void i_click_on_Search_button() {
		CareerPage.clickOnSearchBar(driver);
	}

	@Then("search box has to open")
	public void search_box_has_to_open() {
		CareerPage.textBoxWait(driver);;
	}
	
//	@When("I enter valid mail id as {string}")
//	public void i_enter_valid_mail_id_as_and_click_on_send(String mailid) throws InterruptedException {
//	    CareerPage.joinMailList(driver, "deepthi@gmail.com");
//	    Thread.sleep(3000);
//	    CareerPage.sendClick(driver);
//		}
//
//	@Then("mail must be added")
//	public void mail_must_be_added() {
//		String actualthankyouMessage = CareerPage.joinedMessage(driver);
//	String	expectedMsg= "THANK YOU FOR YOUR INTEREST";
//		//Assert.assertEquals("THANK YOU FOR YOUR INTEREST",actualMessage);
//		 Assert.assertTrue(expectedMsg, actualthankyouMessage.contains(expectedMsg));
//	}
//
//	@When("I enter invalid mail id as {string}")
//	public void i_enter_invalid_mail_id_as_and_click_on_send(String mailid) {
//	   CareerPage.joinMailList(driver, "");
//	   CareerPage.sendClick(driver);
//	}
//
//	@Then("error message must be displayed")
//	public void error_message_must_be_displayed() {
//		String actualMessage = CareerPage.errorMessage(driver);
//		Assert.assertTrue("Must be valid email",actualMessage.contains("be valid email"));
//	}
}
