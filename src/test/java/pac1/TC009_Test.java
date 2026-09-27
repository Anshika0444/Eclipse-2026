package pac1;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC009_Test {
 
    WebDriver driver;
 
    @Parameters("browser")
    @BeforeMethod
    public void beforeMethod(String browser) {
 
        if (browser.equalsIgnoreCase("chrome")) {
 
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
 
        }
 
        driver.manage().window().maximize();
 
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
 
    @Test
    public void loginTest() {
 
        Login_POM obj = new Login_POM(driver);
 
        obj.enterusername("Admin");
        obj.enterpassword("admin123");
        obj.clicklogin();
    }
 
    @AfterMethod
    public void afterMethod() {
 
        if (driver != null) {
            driver.quit();
        }
    }
}
 