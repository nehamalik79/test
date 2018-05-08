package Pacakge1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA_Example2 {
	public static void main (String args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url =  "http://www.DemoQA.com";
		driver.get(url);
		Thread.sleep(3000);
	}

}
