package com.qa.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BasePage;
import com.qa.page.Page;

public class Test1 extends BasePage {

	Page p;

	@BeforeTest
	public void launch() {
		initDriver();
		p = new Page(driver);
	}

	@Test
	public void test() {
		p.clickBankLogin();

	}

}
