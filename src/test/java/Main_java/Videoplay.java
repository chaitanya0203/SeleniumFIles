package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Videoplay {
	WebDriver driver;
	By Demo=By.xpath("//a[text()='Demo Site']");
	By Video=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a");
	By Vimeo=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/ul/li[2]/a");
	//By Play=By.xpath("//*[@id=\"player\"]/div[3]");
	By maximize=By.xpath("//*[@id=\"player\"]/div[7]/div[3]/div/button[3]/div[1]/svg");
	
	
	public Videoplay(WebDriver driver) {
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
	public void vplay() throws InterruptedException{
		driver.findElement(Demo).click();
	Actions act=new Actions(driver);
	WebElement we=driver.findElement(Video);
	WebElement we1=driver.findElement(Vimeo);
	act.moveToElement(we);
	act.moveToElement(we1).click().build().perform();	
	
	/*WebElement ele=driver.findElement(Play);
	ele.click();*/
	/*Thread.sleep(5000);
	driver.findElement(maximize).click();
	act.sendKeys(Keys.ESCAPE);*/
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
