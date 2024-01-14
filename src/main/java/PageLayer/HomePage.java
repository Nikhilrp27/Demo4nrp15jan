package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public boolean getLogoStatus() {
		return logo.isDisplayed();
	}
}
