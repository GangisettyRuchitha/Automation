package Package1;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("Tc_004");
		test.log(LogStatus.INFO, "loading the Properties files.....");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Launching the Brrowser : " + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childprop.getProperty("amazonurl"));
				
		selectOption("amazonsearchdrop_id", "Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using the locator  :- " + orProp.getProperty("amazonsearchdrop_id"));
		
		typeText("amazonsearchtextbox_name", "Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Button By using the locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		report.endTest(test);
		report.flush();

	}

}
