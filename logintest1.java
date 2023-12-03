package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class logintest1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1:8000/login");
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/button")).click();
		try {
			System.out.println("Login successful!");
		} catch (Exception e) {
		    System.out.println("Login failed!");
		}
		driver.close();
	}

}

