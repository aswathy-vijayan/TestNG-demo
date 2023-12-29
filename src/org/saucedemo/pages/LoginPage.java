package org.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;	
	}
	
	public void setUsername(String username) {
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys(username);
	}
	
	public	 void setPassword(String passw) {
		WebElement uname=driver.findElement(By.id("password"));
		uname.sendKeys(passw);
	}
	public void clickLogin() {
		WebElement log=driver.findElement(By.id("login-button"));
		log.click();
	}
}
