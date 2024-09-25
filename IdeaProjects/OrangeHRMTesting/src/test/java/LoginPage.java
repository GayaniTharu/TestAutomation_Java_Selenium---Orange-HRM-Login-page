import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    public static void main(String[] args) {
        // Set the path of the FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\GeckoDriver1\\geckodriver-v0.35.0-win64\\geckodriver.exe");

        // Create an instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        //maximize window
        driver.manage().window().maximize();

        // 2. Mention URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //wait in login page
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        // 3. Find username textbox
        WebElement usernametextbox = driver.findElement(By.name("username"));

        // 4. Enter value
        usernametextbox.sendKeys("Admin");

        // 5. Find password textbox
        WebElement passwordtextbox = driver.findElement(By.name("password"));

        // 6. Enter value
        passwordtextbox.sendKeys("admin123");

        // 7. Find login button
        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // 8. Click the button
        loginbtn.click();

        //driver.quit(); // Close the browser

    }
}


