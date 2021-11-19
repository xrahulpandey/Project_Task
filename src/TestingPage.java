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
	  static String Popdown="//*[@themeid='8' and @documentclick='min_iframe']";
	  static String Popup="//em[@id='zsiq_agtpic']";
	   static String xpathHeading = "//*[@name='q']";
	   static String masters="//button[contains(text(),'Masters')]";
	   static String SelectCountry="//*[@id='vs1__combobox']/div/input";
	   static String StudyPlan="//*[contains(text(),'What are you planning to study?')]/following-sibling::span/div/div/div/input";
	   static String Next="//button[contains(text(),'Next')]";
	   static String SelectColege="//*[contains(text(),'What was your undergraduate college name?')]/following-sibling::span/div/div/div/input";
	   static String SelectMajor="//*[contains(text(),'Which course did you major in?')]/following-sibling::span/div/div/div/input";
	   static String Marks="//*[@id='marks']";
	   static String EnglishTest="//div[contains(text(),'TOEFL')]";
	   static String Score="toefl_overall_score";
	   static String Aptitude="//*[contains(text(),'None')]";
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
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(masters)).click();
		 Wait(5000);
		 driver.findElement(By.xpath(Popup)).click();
		 Wait(2000);
		 driver.switchTo().frame("siqiframe");
		 driver.findElement(By.xpath("//body/div[1]")).click();
		 Wait(2000);
		 driver.switchTo().defaultContent();
		 Wait(5000);
		 driver.findElement(By.xpath(SelectCountry)).click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(SelectCountry)).sendKeys("United States");
		 driver.findElement(By.xpath(SelectCountry)).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath(SelectCountry)).sendKeys(Keys.ENTER);
	
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath(StudyPlan)).click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(StudyPlan)).sendKeys("Business");
		 Wait(5000);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(StudyPlan)).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath(SelectCountry)).sendKeys(Keys.ARROW_DOWN);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(Next)).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);;
		 driver.findElement(By.xpath(SelectColege)).sendKeys("Vellore Institute of Technology");
		 Wait(5000);
		 driver.findElement(By.xpath(SelectColege)).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath(SelectColege)).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath(SelectMajor)).sendKeys("Mechanical");
		 Wait(5000);
		 driver.findElement(By.xpath(SelectMajor)).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath(SelectMajor)).sendKeys(Keys.ENTER);
		 Wait(5000);
		 
		 driver.findElement(By.xpath(Marks)).sendKeys("8.5");
		 driver.findElement(By.xpath(Next)).click();
		 driver.findElement(By.xpath(EnglishTest)).click();
		 driver.findElement(By.id(Score)).sendKeys("110");
		 driver.findElement(By.xpath(Aptitude)).click();
		 driver.findElement(By.xpath(Next)).click();
		 driver.findElement(By.xpath(FindUni)).click();
		 Wait(5000);
		 Select element2 = new Select(driver.findElement(By.xpath(Sort)));
		 element2.selectByIndex(2);
		 driver.findElement(By.xpath(Shortlist1)).click();
    }
  public static void Wait(int w) {
	  try {
			Thread.sleep(w);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  }

