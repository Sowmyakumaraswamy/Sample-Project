package scripts;

import java.io.IOException;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;
import pomPages.Testing;


public class TestCase2 extends StepGroup{
	
	@Test
	public void tc2() throws IOException {
		SkillraryLogin s = new SkillraryLogin(driver);
		s.gearsButton();
		s.demoskillraryapp();
		
		SkillraryDemoLogin sd =new SkillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		
		Testing t= new Testing(driver);
		driverutilities.draganddrop(driver,t.getSelenium(),t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		driverutilities.scrollBar(driver, x, y);
		t.facebookicon();
		
		
	}

}
