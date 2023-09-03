package mainpkg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class MainClass 
{
  public WebDriver d;
	public  WebElement create;
	public  WebElement fname;
	public  WebElement rid;
	public  WebElement btn;
	public  WebElement pwd;
	public  WebElement repwd;
	public  WebElement email;
	public  WebElement phone;
	public  WebElement day;
	public  WebElement mnth;
	public  WebElement yar;
	public  WebElement cntry;
	public  WebElement city;
	public  WebElement home;
	
	
	
	 @Given("^Launch site*")
	public void launch_site()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		d = new ChromeDriver(opt);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		d.get("https://www.rediff.com/");
		d.manage().window().maximize();
	    
	} 
	 @When("Click create account button")
	 public void click_create_account_button()
	 {
		 	create = d.findElement(By.xpath("//*[@id=\'signin_info\']/a[2]"));
			create.click();
		
	 }
	 
	 @When("Enter full name")
	 public void enter_full_name() 
	 {
		 Actions act = new Actions(d);
			fname = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[3]/td[3]/input"));
			act.moveToElement(fname).build().perform();	
			fname.sendKeys("Santoshi Mohite");
		
	 }
	 
	 @When("Enter red id")
	 public void enter_red_id()
	 {
		 Actions act1 = new Actions(d);
			rid = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[1]"));
			act1.sendKeys(rid,"santoshi@cmail.com").build().perform();
	 }
	 
	 @When("Click button")
	 public void click_button() 
	 {
		 btn = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[2]"));
			btn.click(); 
	 }
	 
	 @When("Enter password")
	 public void enter_password()
	 {
		 Actions act2 = new Actions(d);
			pwd = d.findElement(By.xpath("//*[@id=\'newpasswd\']"));
			act2.moveToElement(pwd).build().perform();
			pwd.sendKeys("pass@123");
			
	     	 }
	 
	 @When("Enter retype password")
	 public void enter_retype_password()
	 {
		 repwd = d.findElement(By.xpath("//*[@id=\'newpasswd1\']"));
			repwd.sendKeys("pass@123");
	 }
	 
	 @When("Enter email")
	 public void enter_email()
	 {

			email = d.findElement(By.xpath("//*[@id=\'div_altemail\']/table/tbody/tr[1]/td[3]/input"));
			email.sendKeys("santoshi@gmail.com");
	 }
	 
	 @When("Enter mobile no")
	 public void enter_mobile_no() 
	 {
		 phone = d.findElement(By.xpath("//*[@id=\'mobno\']"));
			phone.sendKeys("8541278888");
	 }
	 
	 @When("Select day")
	 public void select_day()
	 {
		 Actions act3 = new Actions(d);
			day = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[1]"));
			Select day1 = new Select (day);
			act3.moveToElement(day).click(day).sendKeys("04").click().build().perform();
	 }
	 
	 @When("Select month")
	 public void select_month()
	 {

			mnth = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[2]"));
			Select mnth1 = new Select (mnth);
			mnth1.selectByVisibleText("FEB");
	 }
	 
	 @When("Select year")
	 public void select_year()
	 {

			yar = d.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[3]"));
			Select yar1 = new Select (yar);
			yar1.selectByVisibleText("2022");
	 }
	 
	 @When("Select country")
	 public void select_country()
	 {

			cntry = d.findElement(By.xpath("//*[@id=\'country\']"));  //*[@id="country"]
			Select cntry1 = new Select (cntry);
			cntry1.selectByVisibleText("India");
	 }
	 
	 @When("Select city")
	 public void select_city()
	 {

			city = d.findElement(By.xpath("//*[@id=\'div_city\']/table/tbody/tr[1]/td[3]/select"));
			Select city1 = new Select (city);
			city1.selectByVisibleText("Bhopal");	
	 }
	 
	 @When("Click home link")
	 public void click_home_link()
	 {
		//*[@id="wrapper"]/table[1]/tbody/tr[1]/td[1]/a
			home = d.findElement(By.xpath("//*[@id=\'wrapper\']/table[1]/tbody/tr[1]/td[1]/a"));
			home.click();
	 }
	 
	 @Then("Home page should be displayed")
	 public void home_page_should_be_displayed() 
	 {
		 System.out.println("Program is successfully completed "); 
	 }
	 
}
