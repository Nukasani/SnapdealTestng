package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Utilities;

public class WithDataProvider 
{
	@DataProvider(name="data")
	public Object[][] method1()
	{
		Object[][] oo=new Object[][]
				{
			            {"chrome","sriharshanukasani@gmail.com","Harsha@5304"},
			            {"opera","sriharshanukasani@gmail.com","Harsha@5304"},
			            {"firefox","sriharshanukasani@gmail.com","Harha@5304"}
				};
				 return(oo);	
	}

   @Test(dataProvider="data")
   public void method2(String b,String u,String p) throws Exception
   {
	   WebDriver driver;
	   Utilities ut=new Utilities();
	  driver=ut.openBrowser(b);
	  ut.launchSite("https://www.snapdeal.com/");
	  LoginPage lp=new LoginPage(driver);
	  lp.mouseoverLogin();
	  lp.clickonLogin();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  lp.uidFill(u);
	  lp.clickContinue();
	  Thread.sleep(5000);
	  lp.pwdFill(p);
	  lp.submit();
	  driver.switchTo().defaultContent();
	  ut.closeSite();
	  
	   
	   
   }
}