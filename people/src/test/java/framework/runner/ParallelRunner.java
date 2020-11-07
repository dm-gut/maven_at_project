package framework.runner;

import day15.DemoRunner;
import day16.DemoScreen;
import day16.FindHotels;
import day17.DemoHover;
import day17.DemoSelect;

import java.io.IOException;

public class ParallelRunner {
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread t1 = new Thread(() -> {
            try {
                new DemoRunner().demoRunnerStart();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                new DemoScreen().demoScreenStart();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t2.start();

        Thread t3 = new Thread(() -> {
            try {
                new FindHotels().findHotelsStart();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t3.start();

        Thread t4 = new Thread(() -> {
            try {
                new DemoHover().demoHoverStart();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t4.start();

        Thread t5 = new Thread(() -> {
            try {
                new DemoSelect().demoSelectStart();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t5.start();
    }
}
