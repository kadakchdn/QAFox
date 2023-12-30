package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();  //launch the browser
		
		driver.get("https://demo.nopcommerce.com/register"); //navigate to URL
		
		//1] isDisplayed()
		
	//	boolean status_seachfiled=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
	//	System.out.println(status_seachfiled);	
		WebElement seachfiled=driver.findElement(By.xpath("//input[@id='small-searchterms']"));	
		boolean status_searchfiled =seachfiled.isDisplayed();	
		System.out.println(status_searchfiled);  //printing
		
	//	2]isEnabled()
		
		boolean status_radiobutton=driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		
		System.out.println(status_radiobutton);
		
	//3] isSelected()
		
	  boolean status_checkbox=  driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		
		System.out.println("status of checkbbox   :" + status_checkbox);
		
		
		
	 boolean status_radiomale =	driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		
		System.out.println("status of radioname   :"    + status_radiomale);
		
		
		driver.close();  //close the browser
		

	}

}
