package people;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerTest {

    @Test
    public void testAutomatedEngineerAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        assertEquals("The age is not correct!", 25, automatedEngineer.getAge());
    }

    @Test
    public void testAutomatedEngineerSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        assertEquals("The skill is not correct!", 30, automatedEngineer.getSkill());
    }

    @Test
    public void testAutomatedEngineerExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        assertEquals("The experience is not correct!", 10, automatedEngineer.getExperience());
    }

    @Test
    public void testAutomatedEngineerSetAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        automatedEngineer.setAge(20);
        assertEquals("The age is not correct!", 20, automatedEngineer.getAge());
    }

    @Test
    public void testAutomatedEngineerSetSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        automatedEngineer.setSkill(40);
        assertEquals("The skill is not correct!", 40, automatedEngineer.getSkill());
    }

    @Test
    public void testAutomatedEngineerSetExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 10);
        automatedEngineer.setExperience(20);
        assertEquals("The experience is not correct!", 20, automatedEngineer.getExperience());
    }
}
