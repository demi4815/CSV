package Karina.pr4;

public class Person
{
    private long id;
    private String name;
    private String gender;
    private String birthDate;
    private Subdivision subdivision;
    private long salary;

    public Person(long id, String name, String gender, String birthDate, Subdivision subdivision, long salary)
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

    @Override
    public String toString()
    {
        return "id " + id +
                ", name " + name +
                ", gender " + gender +
                ", date of birth" + birthDate +
                ", subdivision " + subdivision.name +
                ", id of subdivision " + subdivision.id +
                ", salary " + salary;
    }

}
