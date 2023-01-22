package CommonWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver {
	public static WebDriver driver;
	public static void createInstance () {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM JARS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tickertape.in/");
	}
}
