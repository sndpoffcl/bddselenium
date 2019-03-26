package com.cg.githubtesting.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,id="login_field")
	private WebElement username;
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	@FindBy(how=How.CLASS_NAME,className="btn")
	private WebElement button;
	@FindBy(how=How.PARTIAL_LINK_TEXT, xpath="//*[@id=\"js-flash-container\"]")
	private WebElement actualErrorMessage;
	
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}

	public String getActualErrorMessage() {
		return actualErrorMessage.getText();
	}

	public void setActualErrorMessage(WebElement actualErrorMessage) {
		this.actualErrorMessage = actualErrorMessage;
	}

	public void clickSignIn() {
		button.submit();
	}
	
	
}
