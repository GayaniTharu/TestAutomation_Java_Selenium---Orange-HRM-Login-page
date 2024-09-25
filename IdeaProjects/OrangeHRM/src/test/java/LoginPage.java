import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedrive.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a URL
        driver.get("https://www.ebay.com");

        // Optionally, maximize the browser window
        driver.manage().window().maximize();

        // Add a wait or other operations, if necessary

        // Close the browser
        //driver.quit();
    }
}
