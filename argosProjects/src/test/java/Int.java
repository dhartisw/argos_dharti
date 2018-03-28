import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Int {

    @Test

    public void rating() throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://argos.co.uk");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
     //dharti bhatt
        WebElement technology = driver.findElement(By.xpath("//a[@class='font-condensed uppercase meganav__level-1-title']"));
        technology.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='font-condensed uppercase meganav__level-1-title']")).getText().equals("HOME & GARDEN"));
        WebElement sidebar = driver.findElement(By.linkText("Televisions and accessories"));
        sidebar.click();
        WebElement television = driver.findElement(By.linkText("Televisions"));
        television.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement custmerrating = driver.findElement(By.className("ac-accordion__expand-button"));
        custmerrating.click();
       // Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement rating = driver.findElement(By.id("filter-customer-rating-5"));
                //By.className("ac-facet__label ac-facet__label--rating radio__label"));
        rating.click();







    }

    }






