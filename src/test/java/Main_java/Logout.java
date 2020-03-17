package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	WebDriver driver;
	By MyAccount=By.xpath("//*[@id=\"menu-item-50\"]/a");
	By UserEmail=By.id("username");
	By Password=By.id("password");
	By Login=By.name("login");
	By Logout=By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a");
	public Logout(WebDriver driver) {
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
	public void MyAccount() {
		driver.findElement(MyAccount).click();
	}
	public void logindetails() {

		driver.findElement(UserEmail).sendKeys("koradabhanu@gmail.com");
		driver.findElement(Password).sendKeys("koradabhanu");
	}
	public void login() {
		driver.findElement(Login).click();
	}
	public void logout() {
		driver.findElement(Logout).click();
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
