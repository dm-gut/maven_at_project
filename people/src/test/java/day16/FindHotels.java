package day16;

import framework.driver.Driver;
import framework.driver.SafeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

public class FindHotels {

    @Before
    public void initDriver() {
        SafeDriver.getWebDriver().manage().window().maximize();
        SafeDriver.getWebDriver().get("https://booking.com");

    }

    @After
    public void closeDriver() {
        SafeDriver.getWebDriver().close();
        SafeDriver.setWebDriver(null);
    }

    @Test
    public void findHotelsStart() throws InterruptedException {

        SafeDriver.getWebDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        SafeDriver.getWebDriver().findElement(By.xpath("//input[@id='ss']")).sendKeys("Paris");
        SafeDriver.getWebDriver().findElement(By.xpath("//div[@class='xp__dates-inner xp__dates__checkin']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//td[@data-date='2020-11-05']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//td[@data-date='2020-11-08']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//div[@data-sb-id=\"main\"][@data-component='search/group/group-with-modal']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//button[@aria-label='Номера: увеличить количество']")).click();
        SafeDriver.getWebDriver().findElement(By.xpath("//div[@class='xp__button']")).click();
        //TODO delete Thread.sleep
        Thread.sleep(3000);
        SafeDriver.getWebDriver().findElement(By.xpath("//span[contains(., '1 220 +')]")).click();
        //TODO delete Thread.sleep
        Thread.sleep(3000);
        SafeDriver.getWebDriver().findElement(By.xpath("//li[@class=' sort_category   sort_price ']")).click();
        //String price = driver.findElement(By.xpath("//div[@id='hotellist_inner']/div[contains(., data-et-view)][1]//span[contains(., 'Price')]")).getText();

    }
}
