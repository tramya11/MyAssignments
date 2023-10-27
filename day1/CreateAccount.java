package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://leaftaps.com/opentaps/");
        
        driver.manage().window().maximize();
        
      //enter the username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        
        //enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        
        //click on Login button
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        
        //click crmsfa link
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        
        //click Accounts link
        driver.findElement(By.xpath("//a[text()='Accounts']")).click();

        //click create Account
        driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
        
        //click Accounts
        
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Ramya");
        
        driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
        
        WebElement industryDD = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
        
        //Instantiate Select class
        Select sec1 = new Select(industryDD);
        
        //select computer software option
        sec1.selectByVisibleText("Computer Software");
        
        WebElement ownership = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
        
        //Instantiate Select class
        Select sec2 = new Select(ownership);
        
        sec2.selectByVisibleText("S-Corporation");
        
      //select source
        WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
        
       Select sec3 = new Select(sourceDD);
       sec3.selectByValue("LEAD_EMPLOYEE");
        
        
        WebElement markcamp = driver.findElement(By.xpath("//select[contains(@id,'marketingCampaignId')]"));
        
        Select sec4 = new Select(markcamp);
        
        //select cold call option
        sec4.selectByIndex(6);
        
        WebElement state = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvinceGeoId')]"));
        
        Select sec5 = new Select(state);
        //select pay by option
        sec5.selectByValue("TX");
        
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        
        String text = driver.findElement(By.xpath("((//input[@name='accountName'])[2]")).getText();
        System.out.println("Account name is :"+text);
	}

   
	}

