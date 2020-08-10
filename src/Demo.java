import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first java program
		//Create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.deselectByValue("2");
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		//driver.quit();

	}

}
