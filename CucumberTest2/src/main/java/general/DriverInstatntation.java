package general;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInstatntation {

//	public static WebDriver driver;
	
//	public DriverInstatntation() {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/prasanth.sai.menta/eclipse-workspace/CucumberTest/chromedriver_win32/chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		//options.setHeadless(true);
//		driver = new ChromeDriver(options);
//	}
	
	
	public static WebDriver driverSetup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/prasanth.sai.menta/eclipse-workspace/CucumberTest/chromedriver_win32/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	

}
