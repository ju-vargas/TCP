package test;
import calculator.Calculator;

import org.junit.*;
import static org.junit.Assert.*;
class Person {
    private final String givenName;
    private final String surname;
    Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }
    String getDisplayName() {
        return surname + ", " + givenName;
    }
}
class PersonTest {
    @Test
    void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden");
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);
    }

    public static void main(String args[]) {
        PersonTest p = new PersonTest();
        p.testGetDisplayName();
        System.out.println("Nenhum erro encontrado!");
    }
}