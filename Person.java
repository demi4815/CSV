package Karina.pr4;

/**
 * Сущность Человек с полями:
 * ID
 * Имя
 * Пол
 * Подразделение(Сущность подразделение)
 * Зарплата
 * Дата рождения
 */
public class Person
{
    public long id;
    public String name;
    public String gender;
    public String birthDate;
    public Subdivision subdivision;
    public long salary;

    /**
     * Конструктор
     */
    public Person(long id, String name, String gender, String birthDate, Subdivision subdivision, long salary)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.subdivision = subdivision;
        this.salary = salary;
    }

    /**
     * Геттер для ID
     * @return ID
     */
    public long getId()
    {
        return id;
    }

    /**
     * Вывод информации консоль о человеке(переопределение метода toString())
     * @return строка с информацией
     */
    @Override
    public String toString()
    {
        return "id " + id +
                ", name " + name +
                ", gender " + gender +
                ", date of birth " + birthDate +
                ", subdivision " + subdivision.name +
                ", id of subdivision " + subdivision.id +
                ", salary " + salary;
    }

}
