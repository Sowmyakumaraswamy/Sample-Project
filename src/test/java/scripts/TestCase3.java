package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Selenium;
import pomPages.SkillraryLogin;
import pomPages.WishList;

public class TestCase3 extends StepGroup{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLogin s = new SkillraryLogin(driver);
		s.searchtextbox(pdata.getPropertydata("coursename"));
		s.searchbutton();
		
		Selenium se = new Selenium(driver);
		se.corejavaselenium();
		
		WishList w = new WishList(driver);
		
		w.closepopup();
		
		driverutilities.switchframe(driver);
		w.playbtn();
		
		Thread.sleep(5000);
		
		w.pausebtn();
		Thread.sleep(3000);
		
		driverutilities.switchbackframe(driver);
		w.wishlist();
	}

}
