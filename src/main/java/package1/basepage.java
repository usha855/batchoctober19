package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	public static WebDriver driver;
	public String browser="chrome";
	public basepage()
	{
		if(driver==null)
		{
			if
			(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\cd77\\chromedriver.exe");
				driver=new  ChromeDriver();
			}
			else if
			(browser.equals("firefox"))
			{
			
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
	public boolean elementfound(WebElement element)
	{
		boolean res=false;
		try
		{
			res=element.isDisplayed();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	public void settest(WebElement element,String name)
	{
		if(name!=null)
		{
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}
	public String gettextattribute(WebElement element) {
		return element.getAttribute("value");
	}
	public String selectfromdropdown(WebElement element,String option)
	{
		Select obj=new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
	}
	private void gettext() {
					// TODO Auto-generated method stub
					
				}
	public boolean  iselementvisible(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
			
		}
			catch(Exception e)
			{
				return false;
			}
		
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public void quitdriver()
	{
		driver.quit();
	}


}
