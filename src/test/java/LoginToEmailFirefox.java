import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToEmailFirefox {

    @Test
    public void loginToEmailViaFireFox() {

        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://mail.google.com/mail");

        WebElement emailField = webDriver.findElement(By.cssSelector("#identifierId"));
        emailField.sendKeys("oksanakhalilova@gmail.com");
        emailField.submit();

        WebElement nextButton = webDriver.findElement(By.id("identifierNext"));
        nextButton.click();

        //WebElement paswordField = webDriver.findElement(By.cssSelector(""));


    }
}
