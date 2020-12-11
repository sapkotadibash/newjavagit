package apple;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class car {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver facebook = new ChromeDriver(options);
		
		facebook.get("https://www.facebook.com");

		facebook.findElement(By.id("email")).sendKeys("anticbaby@gmail.com");
		facebook.findElement(By.id("pass")).sendKeys("qaclass123");
		facebook.findElement(By.name("login")).click();
		
		facebook.manage().window().maximize();
		facebook.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/a/div[1]/div")).click();
		facebook.findElement(By.xpath("//a[text()= 'Friends']")).click();
		facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/a[1]/div")).click();
		
//		facebook.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait (facebook, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a")));
//		List<WebElement> friends = facebook.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a"));
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> Allfriends = facebook.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a"));

		System.out.println(Allfriends.size());
		for (int i = 0; i < Allfriends.size(); i++) {
			System.out.println(Allfriends.get(i).getText());
		}
		facebook.close();


//		System.out.println(friends.size());
//	for (WebElement e: friends) {
//	System.out.println(e.getText());
	
//		}
        
}}
