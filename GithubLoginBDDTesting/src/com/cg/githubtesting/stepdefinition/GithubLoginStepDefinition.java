package com.cg.githubtesting.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.githubtesting.beans.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginStepDefinition {
	private WebDriver driver;
	private LoginPage loginPage;
	
	@Before
	public void setUpTestEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\3000158_Subhamay_Samanta\\BDDCucumberSelenium\\chromedriver.exe");
	}
	
	@Given("^user tries to enter github\\.com$")
	public void user_tries_to_enter_github_com() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
		loginPage=PageFactory.initElements(driver, LoginPage.class);
	    throw new PendingException();
	}

	@When("^when a user tries to login with invalid username$")
	public void when_a_user_tries_to_login_with_invalid_username() throws Throwable {
		loginPage.setUsername("sndpof");
		loginPage.setPassword("");
		throw new PendingException();
	}

	@Then("^'Invalid Username or Password' message is displayed for username$")
	public void invalid_Username_or_Password_message_is_displayed_for_username() throws Throwable {
		String expectedErrorMessage="Incorrect username or password.";
		  Assert.assertEquals(expectedErrorMessage,loginPage.getActualErrorMessage());
	    throw new PendingException();
	}

	@When("^when a user tries to login with invalid password$")
	public void when_a_user_tries_to_login_with_invalid_password() throws Throwable {
		loginPage.setUsername("sndpoffcl");
		loginPage.setPassword("password");
	    throw new PendingException();
	}

	@Then("^'Invalid Username or Password' message is displayed for password$")
	public void invalid_Username_or_Password_message_is_displayed_for_password() throws Throwable {
		String expectedErrorMessage="Incorrect username or password.";
		  Assert.assertEquals(expectedErrorMessage,loginPage.getActualErrorMessage());
	    throw new PendingException();
	}

	@When("^when a user tries to login with valid username and password$")
	public void when_a_user_tries_to_login_with_valid_username_and_password() throws Throwable {
		loginPage.setUsername("sndpoffcl");
		loginPage.setPassword("NEWpass@1996");
	    throw new PendingException();
	}

	@Then("^user is able to login to github account$")
	public void user_is_able_to_login_to_github_account() throws Throwable {
		String actualUrl=driver.getCurrentUrl();
	    String expectedUrl="https://github.com/sessions/two-factor";
	    Assert.assertEquals(actualUrl, expectedUrl);
	    throw new PendingException();
	}
	
	@After
	public void tearDownTestEnv() {
	driver.close();
	}
}
