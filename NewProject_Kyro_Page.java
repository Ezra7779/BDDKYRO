package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewProject_Kyro_Page {

	public WebDriver driver;

	public NewProject_Kyro_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1xemp2x'])[3]")
	@CacheLookup
	WebElement Dashboard;

	@FindBy(xpath = "//a[@href='/Addproject']")
	@CacheLookup
	WebElement newprojt;

	@FindBy(xpath = "//input[@name='startdate']")
	@CacheLookup
	WebElement startdt;

	@FindBy(xpath = "//input[@name='enddate']")
	@CacheLookup
	WebElement enddt;

	@FindBy(xpath = "//input[@name='projectname']")
	@CacheLookup
	WebElement prjtname;

	@FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[1]")
	@CacheLookup
	WebElement deptmnt;

	@FindBy(xpath = "//li[@data-value=\"6255701a6afe1b2607d693d2\"]")

	@CacheLookup
	WebElement deptmnt1;

	@FindBy(xpath = "//input[@name='owner']")
	@CacheLookup
	WebElement ownern;

	@FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[2]")
	@CacheLookup
	WebElement sourtmpt;

	@FindBy(xpath = "//li[@data-value='3']")
	@CacheLookup
	WebElement sourtmpt1;

	@FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb'])[3]")
	@CacheLookup
	WebElement prjtyp;

	@FindBy(xpath = "(//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-he7uux'])[3]")
	@CacheLookup
	WebElement prjtyp1;

	@FindBy(xpath = "//input[@name='cost_center']")
	@CacheLookup
	WebElement costcnt;

	@FindBy(xpath = "//input[@name='poc']")
	@CacheLookup
	WebElement poc1;

	@FindBy(xpath = "//button[text()='Submit']")
	@CacheLookup
	WebElement submt;

	public void dashbrd() {
		Dashboard.click();
	}

	public void newprojecticon() {
		newprojt.click();
	}

	public void startdate(String st) {
		startdt.click();
		startdt.sendKeys(st);
	}

	public void enddate(String ed) {
		enddt.click();
		enddt.sendKeys(ed);
	}

	public void prjtname(String ptnme) {
		prjtname.click();
		prjtname.sendKeys(ptnme);
	}

	public void deptmntype() {
		// li[@data-value="6255701a6afe1b2607d693d2"]

		deptmnt.click();
		deptmnt1.click();

	}

	public void ownrname(String owname) {
		ownern.click();
		ownern.sendKeys(owname);
	}

	public void sourcetype() {
		sourtmpt.click();

		sourtmpt1.click();

	}

	public void projtype() {
		prjtyp.click();
		prjtyp1.click();

	}

	public void costcenter(String cstcent) {
		costcnt.click();
		costcnt.sendKeys(cstcent);
	}

	public void poc(String pc) {
		poc1.click();
		poc1.sendKeys(pc);
	}

	public void submitbt() {
		submt.click();

	}

}
