package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		         
		         //Load the url
		         driver.get("http://leaftaps.com/opentaps/control/main");
		         
		         //to maximize
		         driver.manage().window().maximize();
		         
		         //enter the username
		         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		         
		         //enter the password
		         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		         
		         //click on Login button
		         driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		         
		         //click crmsfa link
		         driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		         
		         //click Leads link
		         driver.findElement(By.xpath("//a[text()='Leads']")).click();
		         
		         driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		         
		         driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		         
		         driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9003286126");
		         
		         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		         
		         
		         Thread.sleep(3000);
		         
		               
		         
		         driver.findElement(By.xpath("//a[text()='15963']")).click();
		         
		         driver.findElement(By.xpath("//a[text()='Delete']")).click();
		         
		         driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		         
	         
		         driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15963");
		         
		         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		         
		         Thread.sleep(3000);

		         
		         
		         String text =   driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		         System.out.println("Error Message is :"+text);
		         
		         driver.close();
	         

		         
		         
		         
		         


	}

}
