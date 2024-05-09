package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActi_time {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/login/");
//		driver.findElement(By.id("email")).sendKeys("123456789");
//		driver.findElement(By.className("clearfix _5466 _44mg")).sendKeys("987654321");
//		driver.findElement(By.id("loginbutton")).click();
		driver.quit();
	}
}
