package baseMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void closeChrome() {
		driver.close();
	}
	
	public void launchERP() {
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		driver.manage().window().maximize();
	}
	
	public void loginERP() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
	}
	
	//Login with parameters
	public void loginERP1(String username, String password) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnsubmit")).click();
	}
	
	public void logout() {
		WebElement erpLogout = driver.findElement(By.xpath("//li[@id='mi_logout']"));
		erpLogout.click();
	}
	
	public void accessToStockItems() {
		
		driver.findElement(By.xpath("//a[text()='Stock Items ']")).click();
		String actualText = driver.findElement(By.xpath("//span[@id='ewPageCaption']")).getText();
		if(actualText.equals("Stock Items")) {
			
			System.out.println("Test Case is passed, stock Item page is opened..");
		}
		else {
			
			System.out.println("Test Case is failed, stock Item page is not opened..");
		}
		
	}
	
	public void selectExport() {
		
		WebElement exportButton = driver.findElement(By.xpath("//span[@data-caption='Export']"));
		exportButton.click();
			
	}
	
	public void selectHTML() {
		
		WebElement selectHTML = driver.findElement(By.xpath("//a[@data-caption='HTML']"));
		selectHTML.click();
		String actualText = driver.findElement(By.xpath("//td[text()='Stock_Name']")).getText();
		Assert.assertEquals(actualText, "Stock_Name");
		
	}
	
	public void selectCSV() {
		
		WebElement selectCSV = driver.findElement(By.xpath("//a[@data-caption='CSV']"));
		selectCSV.click();
				
	}
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();
		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().contains(fileName)) {
		          // File has been found, it can now be deleted:
		          //dirContents[i].delete();
		          return true;
		      }
		          }
		      return false;
		  }

}
