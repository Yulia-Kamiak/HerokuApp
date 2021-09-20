import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown {

  @Test
  public void checkElements() {

      System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://the-internet.herokuapp.com/dropdown");
      WebElement element = driver.findElement(By.id("dropdown"));
      Select select = new Select(element);
      List<WebElement> options = select.getOptions();
      Assert.assertEquals(options.get(0).getText(), "Please select an option");
      Assert.assertEquals(options.get(1).getText(), "Option 1");
      Assert.assertEquals(options.get(2).getText(), "Option 2");
      select.selectByVisibleText("Option 1");
      Assert.assertTrue(select.getFirstSelectedOption().isSelected());
      select.selectByVisibleText("Option 2");
      Assert.assertTrue(select.getFirstSelectedOption().isSelected());
      driver.quit();

  }
}
