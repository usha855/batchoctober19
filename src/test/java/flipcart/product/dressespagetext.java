package flipcart.product;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dressespagetext {
	dressespageobject dp;
	homepage hp;
	public dressespagetext()
	{
		dp=new dressespageobject();
		hp=new homepage();
	}
	@Test
	public void verifyprodcount()
	{
	   hp.clickdresses();
		Assert.assertTrue(dp.getproductnumberfromheader()==dp.getproductcount(),"failed:count");
		
	}

}
