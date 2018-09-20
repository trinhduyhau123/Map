import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 22);
        hashMap.put("Cook", 21);
        hashMap.put("Smith", 30);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+ "\n");

        System.out.println("-----------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Ascending order of key: ");
        System.out.println(treeMap);

        System.out.println("-----------------------------");

        Map<String, Float> linkedHashMap = new LinkedHashMap<>(3, 0.75f, true);
        linkedHashMap.put("Smith", 30.0f);
        linkedHashMap.put("Anderson", 31.0f);
        linkedHashMap.put("Lewis", 29.0f);
        linkedHashMap.put("Cook", 29.55555f);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Cook"));
    }
}
