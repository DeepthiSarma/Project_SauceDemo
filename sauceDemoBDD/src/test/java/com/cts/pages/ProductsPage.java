
package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

	private static By menuLoc = By.xpath("//button[text()='Open Menu']");
	private static By aboutloc = By.xpath("//a[@id='about_sidebar_link']");
	private static By aboutwaitloc = By.linkText("About");

	
	public static void clickOnMenuBar(WebDriver driver) {
		driver.findElement(menuLoc).click();
	}

	public static void WaitForAbout(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(aboutwaitloc));
	}

	public static void clickOnAbout(WebDriver driver) {

		driver.findElement(aboutloc).click();
	}

	public static String getTitle(WebDriver driver) {
		String actualtitle = driver.getTitle();
		return actualtitle;
	}
}
