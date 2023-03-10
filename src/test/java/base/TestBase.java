package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static Properties prop=null;
	public static WebDriver driver=null;
	
	
	//constructor
	public TestBase() {
		String path=System.getProperty("user.dir")+"//src//test//resources//configFiles//config.properties";
		prop=new Properties();
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(path);
			try {
				prop.load(fileIn);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initialize() {
		String strBrowser=prop.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
	}
}
