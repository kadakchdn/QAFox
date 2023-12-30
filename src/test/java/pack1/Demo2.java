package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();  //launch the chrome browser.
		
		driver.get("https://omayo.blogspot.com/");
		
		
		//boolean status_loginbutton =driver.findElement(By.xpath("//button[@type='button']")).isDisplayed();
	//	System.out.println(status_loginbutton);
		
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		
		boolean status_button =button.isDisplayed();
		
		System.out.println(status_button);
		
	
		
		
		boolean status_textfield=driver.findElement(By.xpath("//input[@id='tb2']")).isEnabled();
		
         System.out.println(status_textfield);
         
         
         boolean status_checkbox=driver.findElement(By.xpath("//input[@value='orange']")).isSelected();
         
         System.out.println(status_checkbox);
         
     	driver.close();  //close the browser.
     	
	}

}
