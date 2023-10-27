package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookcreate {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com//");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("T");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("tramya07@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test12345");
        WebElement Day = driver.findElement(By.xpath("//select[contains(@id,'day')]"));
        Select sec = new Select(Day);
        sec.selectByValue("11");
        WebElement Month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
        Select sec1 = new Select(Month);
        sec1.selectByVisibleText("Jun");
        WebElement Year = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
        Select sec2 = new Select(Year);
        sec2.selectByVisibleText("1986");
        
        driver.findElement(By.xpath("//label[@class='_58mt']")).click();


 
        


	}
	

}
