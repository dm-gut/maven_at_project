package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.tut.by");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='mus_il']/span[@class='mus_il_t mus_tt8']")).click();
        driver.findElement(By.xpath("//div[@class='wob_df wob_ds'][@role='button']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='wob_gs']/*[local-name() = 'svg']/*[@class='wob_t wob_gs_l20' and contains(@aria-label,'Celsius')]")).getAttribute("aria-label"));

        driver.close();
    }
}
