
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToBasket {

    @Test

    public void droupdownbutton()throws Exception
    {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://argos.co.uk");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement technology = driver.findElement(By.xpath("//a[@class='font-condensed uppercase meganav__level-1-title']"));
        technology.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        Assert.assertTrue((driver.findElement(By.xpath("//a[@class='font-condensed uppercase meganav__level-1-title']")).getText()).equals("HOME & GARDEN"));
        WebElement televisionandassessories = driver.findElement(By.linkText("Televisions and accessories"));
        televisionandassessories.click();
        WebElement televisions = driver.findElement(By.linkText("Televisions"));
        televisions.click();

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        List <WebElement>  tvElements = new ArrayList<WebElement>();






        for(int i=1; i<=30; i++)
        {
            WebElement element = driver.findElement(By.xpath("//div[@class='search']/div/div[2]/div[4]/div[" + i + "]" ) );


          //  System.out.println(driver.findElement(By.xpath("//div[@class='search']/div/div[2]/div[4]/div[" + i + "]/a[2]/div[3]/span" ) ).getText());

               tvElements.add(element);
        }

        System.out.println(tvElements.size() );





    }
}
