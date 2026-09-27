package pac1;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Login_POM {
 
    WebDriver driver;
    WebDriverWait wait;
 
    By uname = By.name("username");
    By pword = By.name("password");
    By loginbutton = By.xpath("//button[@type='submit']");
 
    public Login_POM(WebDriver driver2) {
        this.driver = driver2;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
 
    public void enterusername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(uname))
            .sendKeys(username);
    }
 
    public void enterpassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pword))
            .sendKeys(password);
    }
 
    public void clicklogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginbutton))
            .click();
    }
}
 