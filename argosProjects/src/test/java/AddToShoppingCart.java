import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToShoppingCart {


    @Test
    public void productrating() throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://argos.co.uk");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='container']/div[2]/div/div/div[2]/ul/li/a")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container']/div[2]/div/div/div[2]/ul/li/a")).getText().equals("TECHNOLOGY"));
        driver.findElement(By.linkText("Laptops and PCs")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.linkText("iMacs")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='filter-panel__inner']/div/div[11]/button")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("filter-customer-rating-5")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


       // WebElement parentOfAllImaxElement = driver.findElement(By.xpath("//div[@class='search']/div/div[2]/div[3]"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> apple = new ArrayList<WebElement>();

        for (int a = 1; a<= 5; a++)
        {
            WebElement element =  driver.findElement(By.xpath("//div[@class='search']/div/div[2]/div[3]/div[" + a + "]"));
            apple.add(element);
//            String[] pricesArray;
//            pricesArray[a] = driver.findElement("//div[@class='search']/div/div[2]/div[3]/div[" + a + "]")
            if(a > 3) {
                System.out.println(element.getText( ));
            }
        }






    }
}
