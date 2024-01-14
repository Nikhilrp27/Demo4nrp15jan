package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.When;

public class PIMPageStep extends BaseClass {
	private static PIMPage pimpg;

	@When("user is on PIM page and validate url")
	public void user_is_on_pim_page_and_validate_url() {
		pimpg = new PIMPage();
		String url = null;
		try {
			url = pimpg.verifyPimPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean a = url.contains("pim");
		Assert.assertEquals(a, true);
	}

	@When("user click on Add Employee and enter firstname and lastname and click on save button")
	public void user_click_on_add_employee_and_enter_firstname_and_lastname_and_click_on_save_button() {

		try {
			pimpg.addEmp("rucha", "zaware");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
