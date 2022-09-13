package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatTask_Kyro_Page {
	
	
	public WebDriver driver;
	public CreatTask_Kyro_Page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//div[text()='View All'])[1]")
	@CacheLookup
	 WebElement viwal;
	
	@FindBy(xpath = "//button[@texttransform='none']")
	@CacheLookup
	 WebElement creattsk;
	

	@FindBy(xpath = "//input[@name='summary']")
	@CacheLookup
	 WebElement sumry;

	@FindBy(xpath = "//input[@name='task_type']")
	@CacheLookup
	 WebElement tsktyp;

	@FindBy(xpath = "//input[@name='description']")
	@CacheLookup
	 WebElement desptn;

	@FindBy(xpath = "//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb']")
	@CacheLookup
	 WebElement prty;

	@FindBy(xpath = "//li[@data-value='3']")
	@CacheLookup
	 WebElement prty1;
	
	@FindBy(xpath = "//input[@name='location']")
	@CacheLookup
	 WebElement loct;

	@FindBy(xpath = "//input[@name='start_date']")
	@CacheLookup
	 WebElement stdt;

	@FindBy(xpath = "//input[@name='due_date']")
	@CacheLookup
	 WebElement endt;

	@FindBy(xpath ="//button[contains(@class,'MuiButtonBase-root  css-7yz33c')]")
	@CacheLookup
	 WebElement subt;

	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root  css-1w8rgmy')]")
	@CacheLookup
	 WebElement canl;


	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1xemp2x'])[3]")
	@CacheLookup
	 WebElement Dashboard1;
	
	@FindBy(xpath = "//button[contains(@class,'MuiIconButton-sizeSmall css-ls7mz4')]")
	@CacheLookup
	 WebElement flag; 


	@FindBy(xpath = "(//li[contains(@class,'MuiButtonBase-root css-he7uux')])[2]")
	@CacheLookup
	 WebElement logot;
	
	public void viewAll() {
		viwal.click();
	}

	public void createtask() {
		creattsk.click();
	}

	public void summary1(String sumary) {
		sumry.click();
		sumry.sendKeys(sumary);
	}

	public void tasktype(String tktp) {
		tsktyp.click();
		tsktyp.sendKeys(tktp);
	}

	public void description(String despt) {
		desptn.click();
		desptn.sendKeys(despt);
	}
	public void priority() {
		prty.click();
		prty1.click();
	}

	public void location(String loc) {
		loct.click();
		loct.sendKeys(loc);
		
		}
	public void stdtctk(String sttk) {
		stdt.click();
		stdt.sendKeys(sttk);
		
	}
	public void endtctk(String entk) {
		endt.click();
		endt.sendKeys(entk);
		
	}

	public void submitcttk() {
		subt.click();
	}
	public void canclebutn() {
		canl.click();
	}
	public void backbtn() {
		Dashboard1.click();
	}
	public void grenwhiteflag() {
		flag.click();
	}
	public void logout() {
		logot.click();
	}

	
	
	
	
}
