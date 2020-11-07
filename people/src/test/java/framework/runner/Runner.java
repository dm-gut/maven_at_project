package framework.runner;

import day15.DemoRunner;
import day16.DemoLog;
import day16.DemoScreen;
import day16.FindHotels;
import day17.DemoHover;
import day17.DemoSelect;

import java.io.IOException;
import java.net.MalformedURLException;

public class Runner {
    public static void main(String[] args) throws IOException, InterruptedException {
        //DemoLog.demoLogStart();
        //new DemoRunner().demoRunnerStart();
        //new DemoScreen().demoScreenStart();
        new FindHotels().findHotelsStart();
        new DemoHover().demoHoverStart();
        //new DemoSelect().demoSelectStart();
    }
}
