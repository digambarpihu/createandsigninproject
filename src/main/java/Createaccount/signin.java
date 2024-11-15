package Createaccount;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signin {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	WebElement clickonsignin = driver.findElement(ByXPath.xpath("(//li[@class='authorization-link'])[1]"));
	clickonsignin.click();
	Thread.sleep(10);

	WebElement emailenter = driver.findElement(ByCssSelector.cssSelector("input#email"));
	emailenter.sendKeys("Digambar.sharma@gmail.com");

	WebElement Fillpass = driver.findElement(ByCssSelector.cssSelector("input#pass"));
	Fillpass.sendKeys("Digambar@123");

	WebElement clicksigninBtn = driver.findElement(ByXPath.xpath("//button[@class='action login primary']"));
	clicksigninBtn.click();
}
}
