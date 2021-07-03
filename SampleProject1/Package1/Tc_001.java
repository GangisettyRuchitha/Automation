package Package1;

import org.openqa.selenium.WebDriver;

public class Tc_001 extends BaseTest
{
	
	public static WebDriver driver;


	public static void main(String[] args) throws Exception
	{
		init();
		launch("chromebrowser");
		maximize();
		navigateUrl("googleurl");
		waitingProcess();
		//data();
		//waitingProcess();
		closeBrowser();
	}

}
