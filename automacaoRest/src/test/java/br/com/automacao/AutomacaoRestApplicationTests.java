package br.com.automacao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutomacaoRestApplicationTests {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/IDES/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		String actualTitle = driver.getTitle();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {		
		driver.close();
		driver.quit();
	}

	@Test
	public void contextLoads() {
		 try {
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.name("email"));
			login.sendKeys("admin@phptravels.com");
			Thread.sleep(2000);
			WebElement senha = driver.findElement(By.name("password"));
			senha.sendKeys("demoadmin");
			Thread.sleep(2000);
			driver.findElement(By.className("ladda-button ")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("li:nth-child(5) .fa")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@id='ACCOUNTS']/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='content']/div/form/button")).click();
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.name("fname"));
			name.sendKeys("Hector");
			Thread.sleep(2000);
			WebElement lastname = driver.findElement(By.name("lname"));
			lastname.sendKeys("Rodriguez");
			Thread.sleep(2000);
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("rodriguezHec@thehundred.com");
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("thehundred");
			Thread.sleep(2000);
			WebElement phone = driver.findElement(By.name("mobile"));
			phone.sendKeys("11 88888-8888");
			Thread.sleep(2000);
			driver.findElement(By.id("s2id_autogen1")).click();
			Thread.sleep(2000);
			WebElement comboboxElement = driver.findElement(By.name("country"));
			Select combobox = new Select(comboboxElement);
			combobox.selectByVisibleText("Albania");
			WebElement address1 = driver.findElement(By.name("address1"));
			address1.sendKeys("earth 100 street");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".btn-primary")).click();			
			Thread.sleep(3000);
			driver.findElement(By.className("xcrud-search-toggle")).click();
			Thread.sleep(2000);
			WebElement phrase = driver.findElement(By.name("phrase"));
			phrase.sendKeys("Hector");
			Thread.sleep(2000);			
			driver.findElement(By.xpath("//a[contains(text(),'Go')]")).click();
			Thread.sleep(4000);		 
		 } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	@Test
	public void contextLoads() {
	}
*/


}
