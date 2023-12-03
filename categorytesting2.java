package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class categorytesting2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1:8000/user/register");
		driver.findElement(By.name("name")).sendKeys("Shanza");
		driver.findElement(By.name("email")).sendKeys("shanza@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abc!2345");
		driver.findElement(By.name("password_confirmation")).sendKeys("Abc!2345");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div/div[5]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
		    System.out.println("Register successful!");
		} catch (Exception e) {
		    System.out.println("Register failed!");
		}
		driver.close();
	}

}

