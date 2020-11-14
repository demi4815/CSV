package Karina.pr4;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс, в котором хранится список людей и есть метод для добавления
 */

public class ListOfPerson
{
    public List<Person> personList = new LinkedList<>();

    /**
     * Метод, который создает объект класса Person и добавляет его в список
     * (если такой человек с таким ID уже есть в списке, то ничего не происходит)
     */
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
