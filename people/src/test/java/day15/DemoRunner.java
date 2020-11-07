package day15;

import framework.driver.Driver;
import framework.driver.SafeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoRunner {
        @Test
        public void demoRunnerStart() throws InterruptedException {
        WebDriver driver = SafeDriver.getWebDriver();

        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");

        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[contains(., 'сейчас')]")).click();

        WebElement firstResult = new WebDriverWait(driver,10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(., 'сейчас')]")));
        firstResult.click();

        driver.close();
        SafeDriver.setWebDriver(null);
    }
}
