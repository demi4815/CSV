package Karina.pr4;

import java.util.LinkedList;
import java.util.List;

public class ListOfSubdivisions
{
    private List<Subdivision> subdivisionList = new LinkedList<>();

    public void addSubdivision(String name)
    {
        boolean flag = false;

        for (Subdivision subdivision : subdivisionList)
        {
            if (subdivision.getName().equals(name))
            {
                flag = true;
            }
        }

        if(!flag)
        {
            Subdivision subdivision = new Subdivision(name);
            subdivisionList.add(subdivision );
        }
    }

}
