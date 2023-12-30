package pack1;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;




public class Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		
	//	System.out.println(pagesource);
		
		String windowhandle=driver.getWindowHandle();
		
	//	System.out.println(windowhandle);
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		

		Set<String> windowhandles=driver.getWindowHandles();
		
		for(String window1 : windowhandles)
		{
			System.out.println(window1);
			
		}
		
		
		
		driver.quit();
		
		
		
		
		
	}

}
