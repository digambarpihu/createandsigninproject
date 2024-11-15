package AutomationSelenium.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectdropdwon {
	public static void main(String[] args) {
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver1.manage().window().maximize();
		WebElement clkloginbtn=driver1.findElement(By.xpath("//button[@id='menu1']"));
		clkloginbtn.click();
	}

}
