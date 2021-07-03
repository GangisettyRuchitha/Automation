package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test1 {

	public static void main(String[] args) throws Exception 
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\ruchi\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		
		/*OperaOptions oo=new OperaOptions();
		oo.setBinary("");
		System.setProperty("webdriver.opera.driver","path\\operadriver.exe");
		OperaDriver driver=new OperaDriver(oo);
		driver.get(url);*/
		
		System.setProperty("webdriver.ie.driver","E:\\ruchi\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://aecom.okta.com/");
		driver.findElement(By.name("q")).sendKeys("ruchi");
		driver.manage().window().maximize();
		//System.out.println("Welcome to Java Programming");
		//driver.findElement(By.xpa)
		Thread.sleep(5000);
		driver.close();

	}

}
