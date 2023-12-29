package org.saucedemo.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.saucedemo.pages.LoginPage;
import org.testng.annotations.Test;

public class TestNGclass {
	
	WebDriver driver = new ChromeDriver();	
	LoginPage lp = new LoginPage(driver);
	
	@Test
	public void testcase1() {
		System.out.println("This is test case 1");
		lp.setUsername("admin");
		lp.setPassword("passws");
		lp.clickLogin();
		}
	@Test
	public void testcase2() {
		System.out.println("This is test case 2");
		lp.setUsername("user");
		lp.setPassword("passws");
		lp.clickLogin();
		}
	}
