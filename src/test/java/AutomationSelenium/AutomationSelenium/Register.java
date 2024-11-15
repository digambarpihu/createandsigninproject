package AutomationSelenium.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Register {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver1.manage().window().maximize();
		WebElement clkloginbtn=driver1.findElement(By.cssSelector("a.ico-login"));
		clkloginbtn.click();
		driver1.findElement(By.cssSelector("input#Email")).sendKeys("digmbarsharma5@gmail.com");
		driver1.findElement(By.cssSelector("input#Password")).sendKeys("mrcoll@121");
		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("button.button-1.login-button")).click();
		WebElement elementToHover =driver1.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
				
		
		
		Actions al=new Actions(driver1);
	
		
		al.moveToElement(elementToHover).click().build().perform();
		}
}
		
	
		
		
		
		
		
		
				
		
		
	


