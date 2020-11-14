package Karina.pr4;

public class Subdivision
{
    public static long autoId = 1;
    public long id;
    public String name;

    public Subdivision(String name)
    {
        this.id = autoId++;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
