import java.util.Comparator;

class SortTime implements Comparator<Winners>
{
    public int compare(Winners a, Winners b)
    {
        return a.time - b.time;
    }
}