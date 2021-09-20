import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables {

    @Test
    public void checkValueInCell() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String lastName = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(lastName,"Smith");
        String firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(firstName, "John");
        String email = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(email,"jsmith@gmail.com");
        String due = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals(due,"$50.00");
        String webSite = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr[1]/td[5]")).getText();
        Assert.assertEquals(webSite,"http://www.jsmith.com");
        driver.quit();
    }
}
