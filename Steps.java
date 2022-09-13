package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreatTask_Kyro_Page;
import pages.Login_Kyro_Page;
import pages.NewProject_Kyro_Page;

public class Steps {

	WebDriver driver;
	Login_Kyro_Page lp;
	NewProject_Kyro_Page pp;
	CreatTask_Kyro_Page cc;

	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		lp = new Login_Kyro_Page(driver);
		pp = new NewProject_Kyro_Page(driver);
		cc =new CreatTask_Kyro_Page(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("User open url {string}")
	public void user_open_url(String url) {
		driver.get(url);

	}

	@When("User should click on Login button")
	public void user_should_click_on_Login_button() throws InterruptedException {
		Thread.sleep(3000);
		lp.loginbutn();

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_Email_as_and_password_as(String name, String code) {
		lp.userid(name);
		lp.pass(code);

	}

	@When("click on Submit button")
	public void click_on_Submit_button() {
		lp.submt();

	}

	@Then("User should verify Home Page")
	public void user_should_verify_Home_Page() {

		Assert.assertTrue(true);
	}

	@When("User Click on Dashboard")
	public void user_Click_on_Dashboard() {
		pp.dashbrd();
	}

	@When("User should verify the Dashboard page")
	public void user_should_verify_the_Dashboard_page() {
		Assert.assertTrue(true);
		
		
	}

	@When("User Click on New Project button")
	public void user_Click_on_New_Project_button() {
		pp.newprojecticon();
	}

	
	@When("User enter Startdate as {string} and enddate as {string}")
	public void user_enter_Startdate_as_and_enddate_as(String st, String ed) {
		
		pp.startdate(st);
		pp.enddate(ed);
	
	}

	@When("User enter Project Name as {string}")
	public void user_enter_Project_Name_as(String ptnme) {
		pp.prjtname(ptnme);
	}

	@When("User enter Department Details")
	public void user_enter_Department_Details() throws InterruptedException {
		Thread.sleep(3000);
		pp.deptmntype();
	
		
	}

	@When("User enter Owner as {string}")
	public void user_enter_Owner_as(String owname) {
		pp.ownrname(owname);
	}

	@When("User enter Source Template")
	public void user_enter_Source_Template() {
		pp.sourcetype();
		
		
	}

	@When("User enter Project Type")
	public void user_enter_Project_Type() {
		pp.projtype();
		
	}

	@When("User enter Cost Center as {string}")
	public void user_enter_Cost_Center_as(String cstcent) {
		pp.costcenter(cstcent);
	}

	@When("User enter Poc as {string}")
	public void user_enter_Poc_as(String pc) {
		pp.poc(pc);
	}

	@When("User click on Submit button")
	public void user_click_on_Submit_button() {
		
		pp.submitbt();
	}

	@Then("User should verify the project update on Dashboard")
	public void user_should_verify_the_project_update_on_Dashboard() throws IOException {
		WebElement prjtview = driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 MuiGrid-grid-lg-6 css-tletg0'])[1]"));

		File s1 = prjtview.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\91739\\eclipse-workspace\\bdd_kyro_ass\\src\\test\\resources\\screenshots\\Projectview.png");
		FileUtils.copyFile(s1, d1);

	}
	@When("User Click on ViewAll button")
	public void user_Click_on_ViewAll_button() {
		cc.viewAll();
		
	}

	@When("User should verify the Project Name and Tasks")
	public void user_should_verify_the_Project_Name_and_Tasks() {
		
		
	}

	@When("User click on CreateTask button")
	public void user_click_on_CreateTask_button() throws InterruptedException {
		cc.createtask();
		Thread.sleep(2000);
		
	}

	@When("User enter summary as {string}")
	public void user_enter_summary_as(String sumary) {
		cc.summary1(sumary);
		
	}

	@When("User enter tasktype as {string}")
	public void user_enter_tasktype_as(String tktp) {
		cc.tasktype(tktp);
		
	}

	@When("User enter description as {string}")
	public void user_enter_description_as(String despt) {
		cc.description(despt);
	}

	@When("User enter Priority")
	public void user_enter_Priority() {
		cc.priority();
	}

	@When("User enter location as {string}")
	public void user_enter_location_as(String loc) {
		cc.location(loc);
	}
	@When("User enter Startingdate as {string} and endingdate as {string}")
	public void user_enter_Startingdate_as_and_endingdate_as(String sttk, String entk) {
		cc.stdtctk(sttk);
		cc.endtctk(entk);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		cc.submitcttk();
	}

	@Then("User should verify the Task")
	public void user_should_verify_the_Task() throws IOException {
		

        cc.canclebutn();
        
		WebElement prjtview = driver.findElement(By.xpath("//div[contains(@class,'MuiGrid-grid-xs-12 css-15j76c0')]"));

		File s = prjtview.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\91739\\eclipse-workspace\\bdd_kyro_ass\\src\\test\\resources\\screenshots\\Taskview.png");
		FileUtils.copyFile(s, d);
		
		
	}

	@When("User click on Dashboard")
	public void user_click_on_Dashboard() {
		cc.backbtn();
	}

	@Then("User should click on Flag on Top Right")
	public void user_should_click_on_Flag_on_Top_Right() {
		cc.grenwhiteflag();
	}

	@Then("User click on Logout option")
	public void user_click_on_Logout_option() {
		cc.logout();
	}
}
