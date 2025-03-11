// GenericSortUtility.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericSortUtility {
    public static <T extends Comparable<T>> void sort(List<T> list) {
        Collections.sort(list);
    }
}
