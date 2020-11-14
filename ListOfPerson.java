package Karina.pr4;

import java.util.LinkedList;
import java.util.List;

public class ListOfPerson
{
    private List<Person> personList = new LinkedList<>();

    public void addPerson(long id, String name, String gender, String birthDate, Subdivision subdivision, long salary)
    {
        boolean flag = false;

        for (Person person : personList)
        {
            if (person.getId() == id)
            {
                flag = true;
            }
        }

        if(!flag)
        {
            Person person = new Person(id, name, gender, birthDate, subdivision, salary);
            personList.add(person);
        }
    }

}
