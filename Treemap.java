import java.util.TreeMap;
import java.util.HashMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 6);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);

        System.out.println(hm);
        System.out.println(tm); // pairs will be sorted in ascending order(Strings)
    }
}
