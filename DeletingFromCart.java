package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class DeletingFromCart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1:8000/product-detail/melange-casual-black");
		driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"reviews\"]/div/div/div/div[1]/div[2]/p/a[1]")).click();
		driver.findElement(By.name("email")).sendKeys("shanza@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Abc!2345");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div/div[3]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div/nav/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/form/section/div/div/div[2]/div[2]/div[1]/div/div[2]/h3/a")).click();
		driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"reviews\"]/div/div/div/div[1]/div[2]/form/div/div[1]/div/div/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"reviews\"]/div/div/div/div[1]/div[2]/form/div/div[2]/div/textarea")).sendKeys("Good Product");
		driver.findElement(By.xpath("//*[@id=\"reviews\"]/div/div/div/div[1]/div[2]/form/div/div[3]/div/button")).click();
		
		try {
		    System.out.println("Review added successfully!");
		} catch (Exception e) {
		    System.out.println("Review not added!");
		}
		driver.close();
	}

}


