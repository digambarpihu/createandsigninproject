package AutomationSelenium.AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booststrapdropdown {


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver1.manage().window().maximize();
		WebElement clkloginbtn=driver1.findElement(By.xpath("//button[@id='menu1']"));
		clkloginbtn.click();
		List<WebElement> dropdownlList = driver1.findElements(By.cssSelector("ui.dropdown-menu li a"));
		int  listsize = dropdownlList .size();
		System.out.println(listsize);
		
		
	}

}
