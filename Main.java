// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testing Pair
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair);
        pair.setValue(30);
        System.out.println("Updated Pair: " + pair);

        // Testing Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Testing GenericSortUtility
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 1, 9));
        GenericSortUtility.sort(numbers);
        System.out.println("Sorted Numbers: " + numbers);

        // Testing WildcardUtils
        List<Double> doubleNumbers = List.of(1.2, 2.3, 3.4);
        System.out.println("Sum of List: " + WildcardUtils.sumOfNumberList(doubleNumbers));

        // Testing Cache
        Cache<String> cache = new Cache<>();
        cache.add("1", "Apple");
        cache.add("2", "Banana");
        System.out.println("Cache Contents: " + cache);

        Cache<Object> objectCache = new Cache<>();
        objectCache.addAll(cache);
        System.out.println("Object Cache After addAll: " + objectCache);
    }
}
