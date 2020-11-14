package Karina.pr4;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс, в котором хранится список подразделений и есть метод, который возвращает подразделение
 */

public class ListOfSubdivisions
{
    private List<Subdivision> subdivisionList = new LinkedList<>();

    /**
     * Метод, который возвращает нужное подразделение, если оно существует, или создает новое,
     * добавляет его в список и затем возвращает
     * @param name - Название
     * @return Подразделение
     */
    public Subdivision getSubdivision(String name)
    {
        for (Subdivision subdivision : subdivisionList)
        {
            if (subdivision.getName().equals(name))
            {
                return subdivision;
            }
        }

        Subdivision subdivision = new Subdivision(name);
        subdivisionList.add(subdivision );
        return subdivision;
    }

}
