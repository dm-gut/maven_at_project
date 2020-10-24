package people;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPersonAge() {
        Person person = new Person(25);
        assertEquals("The age is not correct!", 25, person.getAge());
    }

    @Test
    public void testPersonSetAge() {
        Person person = new Person(25);
        person.setAge(26);
        assertEquals("The age is not correct!", 26, person.getAge());
    }

    @Test
    public void testPersonDoubleAge() {
        Person person = new Person(2 * 20);
        assertEquals("The age is not correct!", 40, person.getAge());
    }
}
