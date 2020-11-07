package day17;

import framework.driver.Driver;
import framework.driver.SafeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
    @Test
    public void demoSelectStart() throws InterruptedException {

        WebDriver driver = SafeDriver.getWebDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element);
        select.selectByVisibleText("White");

        Thread.sleep(3000);

        driver.close();
        SafeDriver.setWebDriver(null);
    }
}
