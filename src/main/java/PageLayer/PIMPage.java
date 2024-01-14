package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addemp;

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement empIdCatpured;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement empList;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empid;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement search;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyPimPage() throws InterruptedException {
		Wait.click(pim);
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}

	public void addEmp(String Fname, String Lname) throws InterruptedException {
		Wait.click(addemp);
		Thread.sleep(3000);
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Thread.sleep(3000);
		Wait.click(save);
	}
	
	public String captureEmployeeId() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Wait.getAttribute(empIdCatpured, "value");
	}

	public void clickOnEmployeeList() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wait.click(empList);
	}
	
	public void enterEmpId(String empId)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Wait.sendKeys(empid, empId);	
	}
	
	public void clickOnSearch()
	{
		Wait.click(search);
	}
	
}
