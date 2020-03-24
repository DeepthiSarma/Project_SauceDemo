package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static By nameLoc= By.id("user-name");
	private static By passLoc= By.id("password");
	private static By loginLoc=By.className("btn_action");
	private static By errorLoc=By.className("error-button");
	public static void enterUsername(WebDriver driver , String username) {
		
		driver.findElement(nameLoc).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver , String password) {
		
		driver.findElement(passLoc).sendKeys(password);
}
	public static void clickOnLogin(WebDriver driver) {
		
		driver.findElement(loginLoc).click();
	}
	public static String getTitle(WebDriver driver) {
		String actualtitle = driver.getTitle();
		return actualtitle;
	}
	
	public static String errorMessage(WebDriver driver) {
		WebElement errele = driver.findElement(errorLoc);
		String ele = errele.getText();
		return ele;
	}
}
