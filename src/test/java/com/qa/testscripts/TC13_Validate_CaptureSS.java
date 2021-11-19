package com.qa.testscripts;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TC13_Validate_CaptureSS extends TestBase{
	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		OrangeOR.clickpimmodule();
		
		OrangeOR.pimenteremployeename("Linda anderson");
		
		OrangeOR.pinsearchempoyee();
		
		Thread.sleep(2000);
		
		
		
		
	}
	

	@Test(priority=2)
	public void fullPageScreenshot() throws IOException {
		
		String Filename = "OrangeFullPage";
		
		AShot Screen = new AShot();
		Screenshot sshot = Screen.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(Driver);
		
		String Dest = System.getProperty("user.dir") + "/Screenshots/" + Filename + ".jpg";
		
		File FinalDestination = new File(Dest);
		
		ImageIO.write(sshot.getImage(), "jpg", FinalDestination);
			
	}
	
}
