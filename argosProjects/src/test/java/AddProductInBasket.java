import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AddProductInBasket {

    @Test
    public void addBasket()throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://argos.co.uk");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement toy = driver.findElement(By.xpath("//li[@data-el='meganav-category-3']/a"));
        toy.click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement gamestabels = driver.findElement(By.linkText("Games tables"));
        gamestabels.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement multigamestabels = driver.findElement(By.xpath("//div[@itemprop='name']"));
        multigamestabels.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement addinbasket = driver.findElement(By.className("add-to-trolley-button__text"));
        addinbasket.click();





    }
}
