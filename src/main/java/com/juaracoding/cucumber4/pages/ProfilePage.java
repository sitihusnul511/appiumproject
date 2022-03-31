package com.juaracoding.cucumber4.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class ProfilePage {
	
private WebDriver driver;
	
	public ProfilePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "document.querySelector(\"#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul\")")
	List<WebElement> btnProfilePage;
	
	public void goToMenuProfile() {
		tunggu();
		driver.navigate().refresh();
		btnProfilePage.get(3).click();
	}
	
	public String getTxtTitleProfile() {
		return driver.getTitle();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
