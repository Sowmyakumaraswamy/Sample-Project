package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;

public class TestCase1 extends StepGroup {
	
	@Test
	public void tc1() {
		
		SkillraryLogin l = new SkillraryLogin(driver);
		l.gearsButton();
		l.demoskillraryapp();
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocart ad =new Addtocart(driver);
		driverutilities.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbutton();
		driverutilities.alertpopup(driver);
		
		
	}
	

}
