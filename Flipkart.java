package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.className("_30XB9F")).click();
		Thread.sleep(90);
		//driver.findElement(By.cssSelector("//span[text()='Grocery']")).click();
		WebElement s=driver.findElement(By.name("q"));
		s.sendKeys("Iphone 14");
		s.sendKeys(Keys.ENTER);
     
		
		
	}

}
