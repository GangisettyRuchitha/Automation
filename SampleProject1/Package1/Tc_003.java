package Package1;

import org.apache.log4j.Logger;

public class Tc_003 extends BaseTest
{
	private static final Logger log=Logger.getLogger(Tc_003.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("loading the Properties files...");
		
		launch("chromebrowser");
		log.info("Launching the Browser:"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("navigating to Url:"+childprop.getProperty("amazonurl"));
		
		waitingProcess();
		log.info("waiting process");
		
		maximize();
		log.info("window is maximing");
		
		closeBrowser();
		log.info("browser is closed");

	}

}
