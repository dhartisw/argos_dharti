import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ProductRating {

    @Before
    public void rating() throws Exception {
        WebDriver driver = new FirefoxDriver( );
        driver.get("http://demo.nopcommerce.com");
        driver.manage( ).timeouts( ).implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage( ).window( ).maximize( );
    }

     @Test
             public void addttobasket() throws Exception
     {
         WebDriver driver = new FirefoxDriver();

        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();
        Assert.assertTrue(driver.findElement(By.linkText("Books")).getText().equals("Books"));
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement fahrenheit = driver.findElement(By.linkText("Fahrenheit 451 by Ray Bradbury"));
        fahrenheit.click();

        WebElement star = driver.findElement(By.xpath("//div[@style='width: 100%']"));
        star.click();
        WebElement addtocart = driver.findElement(By.id("add-to-cart-button-37"));
        addtocart.click();
        WebElement shoppingcart = driver.findElement(By.className("cart-label"));

        shoppingcart.click();



    }
    public void favorite() throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        
    }
}
