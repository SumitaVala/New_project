package practice_stringProgrtam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\selenium\\target\\classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		js.executeScript("scrollBy(0, 5000)");   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
				
		WebElement element = driver.findElement(By.linkText("Core Java"));
		
		
		

	}

}
