import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs {

    @Test
    public void checkInputValue() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String value = driver.findElement(By.tagName("input")).getText();
//        Assert.assertEquals(value, "1");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String value2 = driver.findElement(By.tagName("input")).getText();
        driver.quit();
    }
}
