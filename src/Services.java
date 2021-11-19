import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Services {

	static WebDriver driver;

	
	public static void WaitForPageLoad() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\chromedriver.exe");   
		  
		  ExpectedCondition<Boolean> pageLoadCondition = new
		            ExpectedCondition<Boolean>() {
		                public Boolean apply(WebDriver driver) {
		                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		                }
		            };
		 WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(pageLoadCondition);}
	public static void Wait(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\chromedriver.exe");   
		 
		  try {
			
			driver.manage().wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
}
