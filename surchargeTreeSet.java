import java.util.SortedSet;
import java.util.TreeSet;

public class surchargeTreeSet<T> extends TreeSet<T> {

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        return subSet(fromElement, true, toElement, true);
    }

}
