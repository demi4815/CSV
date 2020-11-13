package Karina.pr4;

public class Subdivision
{
    private static long autoId = 1;
    private long id;
    private String name;

    public Subdivision(String name)
    {
        this.id = autoId++;
        this.name = name;
    }
}
