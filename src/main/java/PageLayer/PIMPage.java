package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass {

	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;
	
	
	public PIMPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPimPage() throws InterruptedException
	{
		Wait.click(pim);
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
	public void addEmp(String Fname,String Lname) throws InterruptedException
	{
		Wait.click(addemp);
		Thread.sleep(3000);
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Thread.sleep(3000);
		Wait.click(save);
	}

	
}
