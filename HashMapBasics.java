import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    static void main() {
        Map<String,String> mapping = new HashMap<>();

        //insertion
        mapping.put("in","india");
        //mapping.put("in","india3");
        mapping.put("en","England");
        mapping.put("us","united states");

        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br","brazil");

        System.out.println("before: "+ table);
        table.putAll(mapping);
        System.out.println("After: "+ table);

//        //deletion
//        table.remove("en");
//        System.out.println(table);
//
//        table.putIfAbsent("in","india3");
//        System.out.println(table);
//
//        table.putIfAbsent("is","india3");
//        System.out.println(table);
//
//        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("mu","none"));
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

        System.out.println(table.containsKey("im"));

        System.out.println(table.containsValue("united states of america"));
        System.out.println(table);

        table.replace("in","indonesia");
        System.out.println(table);

        Set<String> keySet=table.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        //get all the entries from map
        table.entrySet();

    }
}
