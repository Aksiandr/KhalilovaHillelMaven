package selectorsHW15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {

    @Test
    public void TestThird() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Thread.sleep(3000);
        WebElement buttonManager = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'manager')]"));
        buttonManager.click();

        Thread.sleep(1000);
        WebElement buttonOpenAccount = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'openAccount')]"));
        buttonOpenAccount.click();

        Thread.sleep(1000);
        WebElement dropdownCustomerName = webDriver.findElement(By.id("userSelect"));
        dropdownCustomerName.sendKeys("Harry Potter");

        Thread.sleep(1000);
        WebElement dropdownCurrency = webDriver.findElement(By.id("currency"));
        dropdownCurrency.sendKeys("Dollar");

        WebElement buttonSubmitProcess = webDriver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmitProcess.click();

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

    }
}

