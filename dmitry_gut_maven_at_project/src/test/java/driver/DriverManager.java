package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    public static WebDriver getDriver(Config config) {
        switch (config != null ? config : Config.CHROME) {
            case FF -> {
                return getFFDriver();
            }
            case IE11 -> {
                return getIE11Driver();
            }
            default -> {
                return getChromeDriver();
            }
        }
    }

    private static WebDriver getIE11Driver() {
        //TODO
        return null;
    }

    private static WebDriver getFFDriver() {
        //TODO
        return null;
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
        return new ChromeDriver(caps);
    }
}