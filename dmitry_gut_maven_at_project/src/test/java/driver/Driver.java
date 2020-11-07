package driver;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;
    private static Config config;

    public Driver() {
    }

    public void setConfig(Config config) {
        Driver.config = config;
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = DriverManager.getDriver(config);
        }
        return driver;
    }

    public static void setWebDriver(WebDriver driver) {
        Driver.driver = driver;
    }
}
