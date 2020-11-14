package Karina.pr4;

import java.util.LinkedList;
import java.util.List;

public class ListOfSubdivisions
{
    private List<Subdivision> subdivisionList = new LinkedList<>();

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
