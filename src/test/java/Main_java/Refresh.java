package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh 
{
	WebDriver driver;
	By MyAccount=By.xpath("//*[@id=\"menu-item-50\"]/a");
	By UserEmail=By.id("username");
	By Password=By.id("password");
	By Login=By.name("login");
	By Demosite=By.xpath("//*[@id=\"menu-item-251\"]/a");
	By Firstname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By Lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Email=By.xpath("//*[@id=\"eid\"]/input");
	By Phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By Gender=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By Year= By.xpath("//*[@id=\"yearbox\"]");
	By YearPick=By.xpath("//*[@id=\"yearbox\"]/option[84]");
	By Month= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By MonthPick= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[4]");
	By Date= By.xpath("//*[@id=\"daybox\"]");
	By DatePick= By.xpath("//*[@id=\"daybox\"]/option[3]");
	/*By Cricket= By.xpath("//*[@id=\"checkbox1\"]");
	By Movies= By.xpath("//*[@id=\"checkbox2\"]");
	By Languages=By.xpath("//*[@id=\"msdd\"]");
	By LanguagePick= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a");
	By Skills= By.xpath("//*[@id=\"Skills\"]");
	By SkillsPick=By.xpath("//*[@id=\"Skills\"]/option[8]");*/
	By Country=By.xpath("//*[@id=\"countries\"]");
	By CountryName=By.xpath("//*[@id=\"countries\"]/option[106]");

	By Refresh1=By.xpath("//*[@id=\"Button1\"]");
	public Refresh(WebDriver driver) {
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
	public void demo() {
		driver.findElement(Demosite).click();
		
		
	}
	public void Attributes() throws InterruptedException {
		driver.findElement(Firstname).sendKeys("chaitanya");
		driver.findElement(Lastname).sendKeys("Sure");
		driver.findElement(Email).sendKeys("SUreChaitanya");
		driver.findElement(Phone).sendKeys("0123456789");
		driver.findElement(Gender).click();
		driver.findElement(Country).click();
		driver.findElement(CountryName).click();
		driver.findElement(Year).click();
		driver.findElement(YearPick).click();
		driver.findElement(Month).click();
		driver.findElement(MonthPick).click();
		driver.findElement(Date).click();
		driver.findElement(DatePick).click();
		Thread.sleep(3000);
		
	}
		
	public void Refresh1() throws InterruptedException
	{
		driver.findElement(Refresh1).click();
		Thread.sleep(4000);
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
