package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RemoveFile {
	WebDriver driver;
	By Demo=By.xpath("//a[text()='Demo Site']");
	By More=By.xpath("//a[text()='More']");
	By fileup=By.xpath("//a[text()='File Upload']");
	By Browse=By.xpath("//input[@id='input-4']");
	By Remove=By.xpath("/html/body/section/div[1]/div/div/div[1]/button[1]/span");
	
	public RemoveFile(WebDriver driver) {
		this.driver=driver;
	}

	public void url() {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium Jars\\chrome driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void loginpage() {
		driver.get("http://practice.automationtesting.in/");

	}
	public void filerem() throws InterruptedException{
		driver.findElement(Demo).click();
	Actions act=new Actions(driver);
	WebElement we=driver.findElement(More);
	WebElement we1=driver.findElement(fileup);
	act.moveToElement(we);
	act.moveToElement(we1).click().build().perform();	
	driver.findElement(Browse).sendKeys("C:\\Users\\BLTuser.BLT0222\\Desktop\\newXcel.xlsx");
	Thread.sleep(3000);
	driver.findElement(Remove).click();
	Thread.sleep(5000);
	}
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=((TakesScreenshot) driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
	public void quit() {
		driver.close();
	}
}
