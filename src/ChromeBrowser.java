import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browsersDrivers\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://corammerswork.ml/wordpress/test1/");

	}

}
