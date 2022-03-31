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
	
	@FindBy(xpath = "//*[@id=\\\"fadein\\\"]/div[1]/div/div[3]/ul/li[4]/a")
	WebElement btnProfilePage;
	
	public void goToMenuProfile() {
		btnProfilePage.click();
	}
	
	public String getTxtTitleProfile() {
		return driver.getTitle();
	}

}
