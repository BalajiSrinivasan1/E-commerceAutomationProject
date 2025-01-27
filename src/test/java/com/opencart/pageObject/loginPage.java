package com.opencart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	public loginPage(WebDriver driver){
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	 @FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmailAddress;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//button[text()='Login']")
		WebElement btnLogin;
		
		@FindBy(xpath="//h2[text()='My Account']")
		WebElement msgHeading;
		
		
		
		public void setEmail(String email)
		{
			txtEmailAddress.sendKeys(email);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			btnLogin.click();
		}
		public boolean isMyAccountPageExists()
		{
			try
			{
			return (msgHeading.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
}
