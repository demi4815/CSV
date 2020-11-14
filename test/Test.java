package Karina.pr4.test;

import Karina.pr4.*;
import org.junit.*;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Test
{
    @org.junit.Test
    public void testGetSubdivision()
    {
        ListOfSubdivisions list = new ListOfSubdivisions();

        assertEquals(0, list.subdivisionList.size());

        Subdivision[] expected = {new Subdivision("A"), new Subdivision("B")};

        list.getSubdivision("A");
        list.getSubdivision("B");

        Iterator<Subdivision> iterator = list.subdivisionList.iterator();

        Subdivision[] actual = new Subdivision[list.subdivisionList.size()];

        for (int i = 0; i < list.subdivisionList.size(); i++)
        {
            actual[i] = iterator.next();
            assertEquals(expected[i].name, actual[i].name);
        }

        assertEquals(1, expected[0].id);
        assertEquals(2, expected[1].id);
        assertEquals(3, actual[0].id);
        assertEquals(4, actual[1].id);

        list.getSubdivision("A");
        assertEquals(2, list.subdivisionList.size());

    }

    public boolean assertEqualPerson(Person expected, Person actual)
    {
        return expected.id == actual.id &&
                expected.name.equals(actual.name) &&
                expected.gender.equals(actual.gender) &&
                expected.birthDate.equals(actual.birthDate) &&
                expected.subdivision.equals(actual.subdivision) &&
                expected.salary == actual.salary;
    }

    @org.junit.Test
    public void testAddPerson()
    {
        ListOfPerson list = new ListOfPerson();

        assertEquals(0, list.personList.size());

        Subdivision[] sub = {new Subdivision("A"), new Subdivision("B")};
        Person per1 = new Person(123, "Ann", "Female", "15.05.1970", sub[0], 1000);
        Person per2 = new Person(124, "Jack", "Male", "07.02.1983", sub[1], 500);
        Person[] expected = {per1, per2};

        list.addPerson(123, "Ann", "Female", "15.05.1970", sub[0], 1000);
        list.addPerson(124, "Jack", "Male", "07.02.1983", sub[1], 500);

        Iterator<Person> iterator = list.personList.iterator();

        Person[] actual = new Person[list.personList.size()];

        for (int i = 0; i < list.personList.size(); i++)
        {
            actual[i] = iterator.next();
            assertTrue(assertEqualPerson(expected[i], actual[i]));
        }

        list.addPerson(123, "Ann", "Female", "15.05.1970", sub[0], 1000);
        assertEquals(2, list.personList.size());

    }

}
