package Package1;

public class Tc_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launch("firefoxbrowser");
		maximize();
		navigateUrl("googleurl");
		waitingProcess();
		//data();
		//waitingProcess();
		closeBrowser();

	}

}
