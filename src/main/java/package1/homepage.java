package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
 @findby(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
 private WebElement Tshirts;

	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
public WebElement women() {
	return women;
}


public WebElement Dresses () {
	return Dresses; 
}
public WebElement TSHIRTS () {
	return TSHIRTS();
}


}
