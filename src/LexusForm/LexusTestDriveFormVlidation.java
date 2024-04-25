package LexusForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LexusTestDriveFormVlidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sannorj\\Desktop\\sig_assesment\\sig_assesment\\chromedriver_win32 (1)");

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.lexus.com.sg/en/contact-us/book-a-test-drive.html?model=ux%20300e");
        
        
        int cookies = driver.findElements(By.xpath("//a[@id='consent_prompt_submit']")).size();
        
        if(cookies==1) {
        	WebElement btnAccpet = driver.findElement(By.xpath("//a[@id='consent_prompt_submit']"));
        	btnAccpet.click();

        }
        
       System.out.print("git commit");
       
        WebElement firstName = driver.findElement(By.name("input_first_name"));
        firstName.sendKeys("CPL");

        WebElement lastName = driver.findElement(By.name("input_last_name"));
        lastName.sendKeys("Test");

        WebElement emailAddress = driver.findElement(By.name("input_email_address"));
        emailAddress.sendKeys("qa@convertium.com");

        WebElement phoneNumber = driver.findElement(By.name("input_phone_number"));
        phoneNumber.sendKeys("+65 91234567");

        WebElement preferredDate = driver.findElement(By.name("datepicker_preferred_date"));
        preferredDate.sendKeys("10 Jan 2021");

        
        
        //need to edit 
        WebElement preferredTime = driver.findElement(By.name("preferredTime"));
        preferredTime.sendKeys("18:00");

//        WebElement preferredConsultant = driver.findElement(By.name("preferredConsultant"));
//        preferredConsultant.sendKeys("");
//
//        WebElement numberOfPax = driver.findElement(By.name("numberOfPax"));
//        numberOfPax.sendKeys("1");
//
//        //need to edit 
//        WebElement preferredModel = driver.findElement(By.id("ux300e"));
//        preferredModel.click();
//
//        WebElement testDriveOption = driver.findElement(By.id("testDriveOption_lexusTestDriveConcierge"));
//        testDriveOption.click();
//
//        WebElement termsAndServices = driver.findElement(By.id("termsAndServices"));
//        termsAndServices.click();
//
//        WebElement marketingConsent = driver.findElement(By.id("marketingConsent"));
//        marketingConsent.click();
//
//      

        
        
        


	}

}
