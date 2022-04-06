package eShipslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void eshipsLogin() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa-eshipz.herokuapp.com/");
	driver.findElement(By.id("email")).sendKeys("automation@eshipz.com");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.id("login-submit")).click();

}
}