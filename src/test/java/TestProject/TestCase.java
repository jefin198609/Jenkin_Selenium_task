package TestProject;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://jefin-dotnetapp.azurewebsites.net"); 
		driver.quit();*/
		System.setProperty("webdriver.chrome.driver","D:/UST-SELF_TRAINING/jenkin-selenium/chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://jefin-dotnetapp.azurewebsites.net";
		driver.get(baseUrl);

	}

}
