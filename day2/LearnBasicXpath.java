package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		         //Launch Chrome Browser
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
		         driver.findElement(By.xpath("//a[contains(text(),('SFA'))]")).click();
		         
		         //click Leads link
		         driver.findElement(By.xpath("//a[contains(text(),('Leads'))]")).click();

		         //click createLead
		         driver.findElement(By.xpath("//a[contains(text(),('Create'))]")).click();
		         
		         //enter companyname
		         driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
		         
		         //enter firstname
		         driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Ramya");
		         
		         //enter lastname
		         driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("T");
		         
		         //click submit
		         driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		         
		         //verify the text by using getText()
		         String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		         System.out.println("Company name is :"+text);
			}


	}

