import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessages {

    @Test
    public void checkAccordanceNotificationMessage() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/p/a")).click();
        String message = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(message,"Action successful\n×");
        driver.quit();
    }
}
