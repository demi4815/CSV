package Karina.pr4;

/**
 * Подразделение с полями:
 * ID(генерится в програме)
 * Название
 */

public class Subdivision
{
    public static long autoId = 1;
    public long id;
    public String name;

    /**
     * Конструктор
     */
    public Subdivision(String name)
    {
        this.id = autoId++;
        this.name = name;
    }

    /**
     * Геттер для имени
     * @return Название
     */
    public String getName()
    {
        return name;
    }
}
