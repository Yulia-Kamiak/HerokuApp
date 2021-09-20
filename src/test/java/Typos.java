import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Typos {

    @Test
    public void checkSpelling() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        List<WebElement> elements = driver.findElements(By.tagName("p"));
        Assert.assertEquals(elements.get(0).getText(), "This example demonstrates a typo being introduced." +
                " It does it randomly on each page load.");
        Assert.assertEquals(elements.get(1).getText(),"Sometimes you'll see a typo, other times you won't.");
        driver.quit();
    }
}
