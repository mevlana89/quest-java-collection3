import java.util.SortedSet;
import java.util.TreeSet;

public class surchargeHashSet extends TreeSet {

    private SortedSet<Hero> subSet(Hero fromElement, boolean b, Hero toElement, boolean b1) {
        return subSet(fromElement, true, toElement, true);
    }

}
