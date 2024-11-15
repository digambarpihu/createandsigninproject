package Createaccount;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class createacuount {
	
public static void main(String[] args) throws InterruptedException {
	


	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	WebElement clickon= driver.findElement(ByXPath.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]"));
	clickon.click();
	Thread.sleep(1000);
	WebElement fname =driver.findElement(By.cssSelector("input#firstname"));
	fname.sendKeys("Digambar");
	WebElement Lname =driver.findElement(By.cssSelector("input#lastname"));
	Lname.sendKeys("Sharma");
	WebElement emailId =driver.findElement(By.cssSelector("input#email_address"));
	emailId.sendKeys("digambar.sharma@gmail.com");  
	WebElement pword =driver.findElement(By.cssSelector("input#password"));
	pword.sendKeys("Digambar@123");
	WebElement confirmword =driver.findElement(By.cssSelector("input#password-confirmation"));
	confirmword.sendKeys("Digambar@123");
	WebElement clickcreateBtn =driver.findElement(By.xpath("//button[@class='action submit primary']"));
	clickcreateBtn.click();

}
}
