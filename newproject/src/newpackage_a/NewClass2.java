package newpackage_a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
public class NewClass2 {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String alertMessage = "";
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://wordpandit.com");
        
       
        System.out.println(alertMessage);
        driver.quit();
       
    }
}