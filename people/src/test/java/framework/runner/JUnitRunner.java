package framework.runner;

import day15.DemoRunner;
import day16.DemoScreen;
import day16.FindHotels;
import day17.DemoHover;
import day17.DemoSelect;
import framework.driver.SafeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        //DemoRunner.class,
        //DemoScreen.class,
        FindHotels.class,
        DemoHover.class,
        //DemoSelect.class
})

public class JUnitRunner {

    static {
        globalBefore();
    }

    public static void globalBefore() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            SafeDriver.getWebDriver().quit();
            SafeDriver.setWebDriver(null);
        }));
    }
}
