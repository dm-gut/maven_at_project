package day16;

import framework.driver.Driver;
import framework.driver.SafeDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class DemoScreen {
    @Test
    public void demoScreenStart() throws IOException {

        WebDriver driver = SafeDriver.getWebDriver();

        driver.manage().window().maximize();
        driver.get("https://tut.by");
        driver.findElement(By.xpath("//div[@class='top-offer']"))
                .isDisplayed();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\chromedriver\\screenshot.png"));

        driver.close();
        SafeDriver.setWebDriver(null);
    }
}
