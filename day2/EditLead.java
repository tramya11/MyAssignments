package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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

         //click createLead
         driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
         
         //enter companyname
         driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
         
         //enter firstname
         driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Ramya");
         
         //enter lastname
         driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("N");
         
         //enter department 
         driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_departmentName')]")).sendKeys("Testing");
         
         //enter description
         driver.findElement(By.xpath("//textarea[contains(@id,'createLeadForm_description')]")).sendKeys("Editpractice");
         
         driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryEmail')]")).sendKeys("tramya07@gmail.com");
         
         WebElement state = driver.findElement(By.xpath("//select[contains(@id,'createLeadForm_generalStateProvinceGeoId')]"));
         
         Select seledit1 = new Select(state);
         //select pay by option
         seledit1.selectByVisibleText("New York");
          
         
         //click submit
         driver.findElement(By.xpath("//input[@name='submitButton']")).click();
         
         //verify the text by using getText()
         String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
         System.out.println("Company name is :"+text);
         
         driver.findElement(By.xpath("//a[text()='Edit']")).click();
         
         driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_description')]")).sendKeys("");
         
         driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_importantNote')]")).sendKeys("Update");
         
         driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
         
         String title = driver.getTitle();
 		System.out.println(title);

         driver.close();

	}

}	

	
