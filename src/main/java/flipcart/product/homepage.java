package flipcart.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;
	
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	

public void clickdresses() {
	dresses.click();
}
}
