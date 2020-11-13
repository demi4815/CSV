package Karina.pr4;

import java.util.Date;

public class Person
{
    private long id;
    private String name;
    private String gender;
    private Date birthDate;
    private Subdivision subdivision;
    private long salary;

    public Person(long id, String name, String gender, Date birthDate, Subdivision subdivision, long salary)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.subdivision = subdivision;
        this.salary = salary;
    }

    public long getId()
    {
        return id;
    }

}
