package people;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CommonEngineerTest {

    private Engineer engineer;
    int expectedSkill;

    public CommonEngineerTest(Engineer engineer, int expectedSkill) {
        this.engineer = engineer;
        this.expectedSkill = expectedSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> commonEngineer() {
        return Arrays.asList(new Object[][]{
                {new AutomatedEngineer(25, 10), 30},
                {new ManualEngineer(25, 10), 20}
        });
    }

    @Test
    public void testEngineerAge() {
        assertEquals("The age is not correct!", 25, engineer.getAge());
    }

    @Test
    public void testEngineerGetSkill() {
        assertEquals("The skill is not correct!", expectedSkill, engineer.getSkill());
    }

    @Test
    public void testEngineerExperience() {
        assertEquals("The experience is not correct!", 10, engineer.getExperience());
    }

    @Test
    public void testEngineerSetAge() {
        engineer.setAge(20);
        assertEquals("The age is not correct!", 20, engineer.getAge());
    }

    @Test
    public void testEngineerSetSkill() {
        engineer.setSkill(20);
        assertEquals("The skill is not correct!", 20, engineer.getSkill());
    }

    @Test
    public void testEngineerSetExperience() {
        engineer.setExperience(20);
        assertEquals("The experience is not correct!", 20, engineer.getExperience());
    }
}
