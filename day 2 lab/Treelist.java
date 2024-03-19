import java.util.*;

public class Treelist {
    public static void main(String[] args) {
        TreeSet<String> N = new TreeSet<String>();
        N.add("deva");
        N.add("mannar");
        N.add("varadha");
        System.out.println(N);
        N.remove("mannar");
        System.out.println(N);
    }
}
