package Pacakge1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA_Example1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\ChromeDriver_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	String url = "http://www.store.demoqa.com" ;
	//	driver.get(url);
		//-----------------------------------Example1-----------
	/*	String title = driver.getTitle();
		int Title_length= title.length();
		System.out.println("Title Name is :" +title);
		System.out.println("Title Length is : " +Title_length);
		
		String Current_url = driver.getCurrentUrl();
		
		if (Current_url.equals(url)) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is not correct");
		}
		
		String PageSource=driver.getPageSource();
		int PageSource_Length = PageSource.length();
		System.out.println("Source Length is :" + PageSource_Length);
		*/
		//---------------------- Example 2-------------
		/*String url2 = "http://www.DemoQA.com";
		driver.get(url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to(url2);
		driver.navigate().refresh();
		driver.close();
		System.out.println("run complte");
		*/
		
		//-----------Example3-----------------//
		
		
		 //http://toolsqa.wpengine.com/automation-practice-form/
		String url3 = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url3);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("Neha");
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys("Malik");
		driver.findElement(By.id("submit")).click();
		System.out.println("found");
		driver.quit();
		
	}
	
	
	
}
