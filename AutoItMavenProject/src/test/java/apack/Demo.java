package apack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();
        Runtime.getRuntime().exec("C:\\Users\\shrim\\eclipse-workspace\\AutoItMavenProject\\AutoItFile\\BrowsingExcelFile.exe");
        
	}

}
