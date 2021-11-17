import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingPage {
	static WebDriver driver ;
	 
	 static String url="https://yocket.com/college-finder";
	   static String xpathHeading = "//*[@name='q']";
	   static String masters="//button[contains(text(),'Masters')]";
	   static String SelectCountry="//*[@id='vs1__combobox']/div/input";
	   static String StudyPlan="//*[contains(text(),'What are you planning to study?')]/following-sibling::span/div/div/div/input";
	   static String Next="//button[contains(text(),'Next')]";
	   static String SelectColege="//*[contains(text(),'What was your undergraduate college name?')]/following-sibling::span/div/div/div/input";
	   static String SelectMajor="//*[contains(text(),'Which course did you major in?')]/following-sibling::span/div/div/div/input";
	   static String Marks="//*[@id='Marks']";
	   static String EnglishTest="//div[contains(text(),'TOEFL')]";
	   static String Aptitude="//div[contains(text(),'NONE')]";
	   static String EnglishMarks="//*[@id='toefl_overall_score']";
	   static String FindUni="//button[contains(text(),'Find Universities')]";
	   static String Sort="//p[contains(text(),'Ambitious Universities')]/parent::div/div[3]/div/div/select";
	   static String Shortlist1="//p[contains(text(),'Ambitious Universities')]/parent::div/div/following-sibling::div[2]/div[2]/div/div/span/span/span/span";
	   static Services services= new Services();

	public static void TestMethod() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\chromedriver.exe");   
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://yocket.com/college-finder");
		 
		 driver.findElement(By.xpath(masters)).click();
		
		 driver.findElement(By.xpath(SelectCountry)).click();
		 driver.findElement(By.xpath(SelectCountry)).sendKeys("United States");
		 driver.findElement(By.xpath(SelectCountry)).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath(SelectCountry)).sendKeys(Keys.ENTER);
	
		 services.Wait();
		
		 driver.findElement(By.xpath(StudyPlan)).click();
		 driver.findElement(By.xpath(StudyPlan)).sendKeys("Business");
		 driver.findElement(By.xpath(StudyPlan)).sendKeys(Keys.ENTER);
		 services.Wait();
		 driver.findElement(By.xpath(Next)).click();
		 services.WaitForPageLoad();
		 driver.findElement(By.xpath(SelectColege)).sendKeys("United States");
		 driver.findElement(By.xpath(SelectColege)).sendKeys(Keys.ENTER);
		 Select element = new Select(driver.findElement(By.xpath(SelectMajor)));
		 element.selectByValue("Computer Science");
		 driver.findElement(By.xpath(Marks)).sendKeys("8.5");
		 driver.findElement(By.xpath(Next)).click();
		 driver.findElement(By.xpath(EnglishTest)).click();
		 driver.findElement(By.xpath(SelectColege)).sendKeys("110");
		 driver.findElement(By.xpath(Aptitude)).click();
		 driver.findElement(By.xpath(Next)).click();
		 driver.findElement(By.xpath(FindUni)).click();
		 services.WaitForPageLoad();
		 Select element2 = new Select(driver.findElement(By.xpath(Sort)));
		 element2.selectByIndex(2);
		 driver.findElement(By.xpath(Shortlist1)).click();
    }
  
  }

