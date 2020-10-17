package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[text()='Sign In']")
	public WebElement click1;
	
	@FindBy(how=How.XPATH,using="//*[text()='login']")
	public WebElement click2;
	
	@FindBy(id="userName")
	public WebElement uid;
	
	@FindBy(id="checkUser")
	public WebElement con;
	
	@FindBy(id="j_password_login_uc")
	public WebElement pwd;
	
	@FindBy(id="submitLoginUC")
	public WebElement click3;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void mouseoverLogin()
	{
		click1.click();
	}
	public void clickonLogin()
	{
		click2.click();
	}
	public void clickContinue() 
	{
		con.click();
	}
	public void uidFill(String x)
	{
		uid.sendKeys(x);
	}
	public void pwdFill(String x)
	{
		pwd.sendKeys(x);
	}
	public void submit()
	{
		click3.click();
	}
}
