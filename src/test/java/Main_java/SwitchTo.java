package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo {
	WebDriver driver;
	By Demosite=By.xpath("//*[@id=\"menu-item-251\"]/a");
	By Switch=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a");
	By alerts=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
	By button=By.xpath("//*[@id=\"OKTab\"]/button");

	
	
	public SwitchTo(WebDriver driver) {
		this.driver=driver;
	}

	public void url() {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium Jars\\chrome driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void loginpage() 
	{
		driver.get("http://practice.automationtesting.in/");

	}
	
	public void alertoperation() {
		driver.findElement(Demosite).click();
		Actions act=new Actions(driver);
		WebElement we=driver.findElement(Switch);
		act.moveToElement(we);
		WebElement we1=driver.findElement(alerts);
		act.moveToElement(we1).click().build().perform();
	}
	
	public void gettext() throws InterruptedException
	{
		driver.findElement(button).click();
		Alert aler=driver.switchTo().alert();
		String msg=aler.getText();
		System.out.println(msg);
		Thread.sleep(3000);
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
