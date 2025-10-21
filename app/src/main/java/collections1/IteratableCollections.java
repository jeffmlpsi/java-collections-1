package collections1;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;


public class IteratableCollections {
    public static void setExample() {
        // Create a immutable Set of integers
        Set<Integer> nums = Set.of(23, 100, -11, 8675309);
        nums.forEach(num -> System.out.println(num));
        //these calls will throw exception UnsupportedOperationException because Set.of creates an immutable set
        // nums.add(42);  
        // nums.removeIf(n -> n == -11);
        for (Integer n : nums) {
            System.out.println(n);
        }

        // To create a mutable Set use new HashSet<T>
        Set<String> names = new HashSet<String>() {
            {
                add("Fluffy");
                add("Spot");
                add("Fido");
            }
        };
        names.add("Rover");
        names.forEach(name -> System.out.println(name));
        names.add("Spot"); // duplicate, will not be added
        names.forEach(name -> System.out.println(name));
        names.removeIf(n -> n.equals("Fido"));
        for (String name : names) {
            System.out.println(name);   
        }
    }   

    public static void listExample() {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.forEach(item -> System.out.println(item));

        String second = items.get(1);
        System.out.println("Second item: " + second);

        items.remove("Banana");
        if (!items.contains("Banana")) {
            System.out.println("List does NOT contain a Banana");
        }
        items.add("Banana");
    
        List<String> moreFruits = new ArrayList<>(Arrays.asList("Banana", "Cherry"));
        items.addAll(moreFruits);
        for (String item : items) {
            System.out.println(item);  
        }
        items.removeIf(i -> i.equals("Banana"));
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));   
        }
    }

    public static void queueExample() {
        Queue<MyCatInfo> catQueue = new LinkedList<>();
        catQueue.add(new MyCatInfo("Whiskers", 2, "Siamese"));
        catQueue.add(new MyCatInfo("Mittens", 3, "Persian"));
        catQueue.add(new MyCatInfo("Shadow", 1, "Maine"));
        catQueue.offer(new MyCatInfo("Tiger", 4, "Bengal"));

        for (MyCatInfo cat : catQueue) {
            System.out.println(cat);   
        }
        MyCatInfo first = catQueue.peek(); //gets first, but does not remove
        System.out.println("First cat in queue: " + first);
        System.out.println("Processing cats in queue:");
        while (!catQueue.isEmpty()) {
            MyCatInfo cat = catQueue.poll();
            System.out.println("getting a cat: " + cat); 
        }

    }
}
