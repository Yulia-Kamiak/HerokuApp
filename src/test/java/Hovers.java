import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hovers {

  @Test
  public void checkProfile1() {

      System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://the-internet.herokuapp.com/hovers");
      Actions action = new Actions(driver);
      WebElement user1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/img"));
      action.moveToElement(user1).build().perform();
      String name1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/h5")).getText();
      Assert.assertEquals(name1,"name: user1");
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/a")).click();
      String foundProfile = driver.findElement(By.tagName("h1")).getText();
      Assert.assertNotEquals(foundProfile,"Not Found");
      driver.quit();
  }


  @Test
  public void checkProfile2() {

      System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://the-internet.herokuapp.com/hovers");
      Actions action = new Actions(driver);
      WebElement user2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/img"));
      action.moveToElement(user2).build().perform();
      String name2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/h5")).getText();
      Assert.assertEquals(name2,"name: user2");
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/a")).click();
      String foundProfile2 = driver.findElement(By.tagName("h1")).getText();
      Assert.assertNotEquals(foundProfile2,"Not Found");
      driver.quit();
  }


  @Test
  public void checkProfile3() {

      System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://the-internet.herokuapp.com/hovers");
      Actions action = new Actions(driver);
      WebElement user3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/img"));
      action.moveToElement(user3).build().perform();
      String name3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/h5")).getText();
      Assert.assertEquals(name3,"name: user3");
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/a")).click();
      String foundProfile3 = driver.findElement(By.tagName("h1")).getText();
      Assert.assertNotEquals(foundProfile3,"Not Found");
      driver.quit();

  }
}
