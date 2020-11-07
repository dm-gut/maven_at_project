package framework.driver;

import org.openqa.selenium.WebDriver;

public class SafeDriver {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        if (webDriver.get() == null) {
            webDriver.set(DriverManager.getDriver(Config.CHROME));
        }
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver instance) {
        SafeDriver.webDriver.set(instance);
    }
}
