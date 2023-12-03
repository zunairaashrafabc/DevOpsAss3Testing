package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class favorite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1:8000");
		

		
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div/nav/div/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div/nav/div/div/ul/li[4]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("/html/body/form/section/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/h3/a")).click();
		
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div[2]/div/div[3]/form/div[2]/a")).click();
        
		driver.findElement(By.name("email")).sendKeys("shanza@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Abc!2345");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div/div[3]/div[1]/button")).click();
		
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[1]/a/i")).click();
		
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[1]/div/div[1]/a")).click();

		try {
		    System.out.println("Item saved to wishlist successfully!");
		} catch (Exception e) {
		    System.out.println("Item failed to save to wishlist!");
		}
		driver.close();
	}

}


