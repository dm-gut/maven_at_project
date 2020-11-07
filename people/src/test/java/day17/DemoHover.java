package day17;

import framework.driver.Driver;
import framework.driver.SafeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoHover {

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
    public void demoHoverStart() throws InterruptedException {

        WebElement currency = SafeDriver.getWebDriver().findElement(By.xpath("//button[@data-tooltip-text='Выберите валюту']"));
        Actions actionsCurrency = new Actions(SafeDriver.getWebDriver());
        actionsCurrency.moveToElement(currency);
        actionsCurrency.perform();

        Thread.sleep(3000);

        WebElement language = SafeDriver.getWebDriver().findElement(By.xpath("//button[@data-tooltip-text='Выберите язык']"));
        Actions actionsLanguage = new Actions(SafeDriver.getWebDriver());
        actionsLanguage.moveToElement(language);
        actionsLanguage.perform();

        Thread.sleep(3000);
        SafeDriver.getWebDriver().close();
        SafeDriver.setWebDriver(null);
    }

    @Test
    public void demoHoverStart2() throws InterruptedException {

        WebElement currency = SafeDriver.getWebDriver().findElement(By.xpath("//button[@data-tooltip-text='Выберите валюту']"));
        Actions actionsCurrency = new Actions(SafeDriver.getWebDriver());
        actionsCurrency.moveToElement(currency);
        actionsCurrency.perform();

        Thread.sleep(3000);

        WebElement language = SafeDriver.getWebDriver().findElement(By.xpath("//button[@data-tooltip-text='Выберите язык']"));
        Actions actionsLanguage = new Actions(SafeDriver.getWebDriver());
        actionsLanguage.moveToElement(language);
        actionsLanguage.perform();

        Thread.sleep(3000);
        SafeDriver.getWebDriver().close();
        SafeDriver.setWebDriver(null);
    }
}
