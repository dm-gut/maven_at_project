package people;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManualEngineerTest {

    @Test
    public void testManualEngineerAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        assertEquals("The age is not correct!", 25, manualEngineer.getAge());
    }

    @Test
    public void testManualEngineerSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        assertEquals("The skill is not correct!", 20, manualEngineer.getSkill());
    }
    @Test
    public void testManualEngineerExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        assertEquals("The experience is not correct!", 10, manualEngineer.getExperience());
    }

    @Test
    public void testManualEngineerSetAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        manualEngineer.setAge(20);
        assertEquals("The age is not correct!", 20, manualEngineer.getAge());
    }

    @Test
    public void testManualEngineerSetSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        manualEngineer.setSkill(30);
        assertEquals("The skill is not correct!", 30, manualEngineer.getSkill());
    }

    @Test
    public void testManualEngineerSetExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25, 10);
        manualEngineer.setExperience(20);
        assertEquals("The experience is not correct!", 20, manualEngineer.getExperience());
    }
}
