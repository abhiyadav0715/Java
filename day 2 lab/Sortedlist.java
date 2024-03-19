import java.util.*;

class Sortedlist {
    public static void main(String[] args) {
        SortedSet<String> N = new TreeSet<String>();
        N.add("Nash");
        N.add("umar");
        N.add("nivas");
        System.out.println(N);
        N.remove("umar");
        System.out.println(N);
    }
}
