package com.qa.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	By bankLogin = By.xpath("//button[text()='Bank Manager Login']");
	By addCustomer = By.xpath("//button[@ng-class='btnClass1']");
	By firstName = By.xpath("//input[@ng-model='fName']");
	By lastName = By.xpath("//input[@ng-model='lName']");
	By postCode = By.xpath("//input[@ng-model='postCd']");

	By buttonAddCutomer = By.xpath("//button[text()='Add Customer']");
	By buttonOpenAccount = By.xpath("//button[@ng-class='btnClass2']");
	By buttonCustomer = By.xpath("//button[@ng-class='btnClass3']");

	By customer = By.id("userSelect");
	By currency = By.id("currency");
	
	By buttonProcess = By.xpath("//button[text()='Process']");
	
	By search = By.xpath("//input[@ng-model='searchCustomer']");

	public WebElement getElement(By by) {
		return driver.findElement(by);
	}

	public WebElement explicitWaitforElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return ele;
	}

	public void clickBankLogin() {
		this.explicitWaitforElement(bankLogin).click();

		this.explicitWaitforElement(addCustomer).click();

		this.explicitWaitforElement(firstName).sendKeys("Mike");

		this.getElement(lastName).sendKeys("J");

		this.getElement(postCode).sendKeys("45204");

		this.getElement(buttonAddCutomer).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		this.explicitWaitforElement(buttonOpenAccount).click();
		
		

		Select select = new Select(this.explicitWaitforElement(customer));

		select.selectByVisibleText("Mike J");

		Select select1 = new Select(this.getElement(currency));

		select1.selectByVisibleText("Dollar");
		
		this.getElement(buttonProcess).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		this.explicitWaitforElement(buttonCustomer).click();
		
		this.explicitWaitforElement(search).sendKeys("Mike");
	}

}
