package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	protected static HomePage hp;

	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		hp = new HomePage();
		String actualTitle = hp.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");

	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		String actualUrl = hp.getCurrentUrl();
		boolean b = actualUrl.contains("dashboard");
		Assert.assertEquals(b, true);

	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		boolean b = hp.getLogoStatus();
		Assert.assertEquals(b, true);

	}
}
