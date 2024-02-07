package Task19;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocaters {

	public static void main(String[] args) {
	         // load the web driver
               WebDriver driver = new ChromeDriver();
               //pass the url of Zuvi
             driver.navigate().to("https://www.guvi.in/register");
             // set implicitwait time duration
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             // set  window maximize
             driver.manage().window().maximize();
             // register the zuvi choose the full name using id
             WebElement name = driver.findElement(By.id("name"));
             name.sendKeys("priyazuvi");
             // choose the email  using id
             WebElement mail = driver.findElement(By.id("email"));
             mail.sendKeys("ct3.staffing@gmail.com");
             // set the password  using cssSelector
             WebElement pass = driver.findElement(By.cssSelector("input#password"));
             pass.sendKeys("zuviclass@24");
             //select the phone number using xpath
             WebElement mob =  driver.findElement(By.xpath("//input[@id='mobileNumber']"));
             mob.sendKeys("8886152611");
             //chick on sign up button using  class name
             WebElement sign = driver.findElement(By.className("signup-btn"));
             sign.click();
             
            //inspect the sign in using tagename locater  print it in the console 
             WebElement ele = driver.findElement(By.tagName("h2"));
             System.out.println(ele.getText());
              
                    
             
	}

}
