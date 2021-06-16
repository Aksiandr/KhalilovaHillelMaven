import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToEmailChrome {

    @Test
    public void loginToEmailViaChrome() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mail.google.com/mail");

        WebElement emailField = webDriver.findElement(By.cssSelector("#identifierId"));
        emailField.sendKeys("khaloksa@gmail.com");
        emailField.submit();

        WebElement nextButton = webDriver.findElement(By.cssSelector("#identifierNext"));
        nextButton.click();

        //WebElement paswordField = webDriver.findElement(By.cssSelector(""));


    }
}
