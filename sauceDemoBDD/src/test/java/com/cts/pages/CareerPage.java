package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPage {

	private static By searchloc=By.xpath("//i[@class='svg svg-search nav-action-list-items-search-form-icon has-fill-primary']");
	private static By textBoxwaitloc= By.xpath("//div[@class='nav-action-list-items-search-form-input-container is-hidden']");
	private static By joinMailloc = By.id("Email");
	private static By sendloc = By.xpath("//span[@class='mktoButtonWrap mktoSimple']");
	private static By errorMsgloc = By.xpath("//div[@class='mktoErrorMsg']");
	private static By joinedloc = By.xpath("//p[@class='supertitle']");

	public static void clickOnSearchBar(WebDriver driver) {
		driver.findElement(searchloc).click();
	}

	public static void textBoxWait(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(textBoxwaitloc));
	}
	
//	public static void joinMailList(WebDriver driver, String mailid) {
//		driver.findElement(joinMailloc).sendKeys(mailid);
//	}
//
//	public static void sendClick(WebDriver driver) {
//	
//		JavascriptExecutor execute =(JavascriptExecutor)driver;
//		execute.executeScript("arguments[0].click();", driver.findElement(sendloc));
//	}
//
//	public static String joinedMessage(WebDriver driver) {
//		WebElement joined = driver.findElement(joinedloc);
//		String thankyou = joined.getText();
//		return thankyou;
//	}
//	
//	public static String errorMessage(WebDriver driver) {
//		WebElement invalid = driver.findElement(errorMsgloc);
//		String error = invalid.getText();
//		return error;
//	}

}

