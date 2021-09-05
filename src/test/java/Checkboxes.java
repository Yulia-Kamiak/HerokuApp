import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void checkCheckboxes() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        String check1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).getAttribute("checked");
        Assert.assertNull(check1);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
        check1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).getAttribute("checked");
        Assert.assertEquals(check1, "true");
        String check2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).getAttribute("checked");
        Assert.assertEquals(check2, "true");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
        check2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).getAttribute("checked");
        Assert.assertNull(check2);
        driver.quit();

    }
}
