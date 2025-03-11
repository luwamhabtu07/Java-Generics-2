// WildcardUtils.java
import java.util.Collection;
import java.util.List;

public class WildcardUtils {
    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    public static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
