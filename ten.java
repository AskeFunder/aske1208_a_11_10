package SorteOpgaver.ch11.aske1208_a_11_10;

import java.util.Iterator;
import java.util.Set;

public class ten
{
    public void removeOddLength(Set<String> set)
    {
        Iterator<String> itr = set.iterator();

        String str;

        while (itr.hasNext())
        {
            str = itr.next();
            if (str.length() % 2 != 0)
            {
                itr.remove();
            }
        }

        for (String skrrt : set)
        {
            System.out.println(skrrt);
        }
    }
}
