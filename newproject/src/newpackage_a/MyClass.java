package newpackage_a;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyClass {


    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        String tagheld = "";
        WebDriverWait a = new WebDriverWait(driver,10);
        
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        a.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("tutorial");
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        tagheld = driver.findElement(By.id("name-and-slogan")).getTagName();
        
        System.out.println(tagheld);
        String Current_url = driver.getCurrentUrl();
        System.out.println(Current_url);
        driver.findElement(By.linkText("Security Project")).click();
        driver.close();
        System.exit(0);
       
    }

}