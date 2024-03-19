import java.io.*;
import java.util.HashMap;

class Hashmap {
    public static void main(String[]arg){
     HashMap<String, String> L=new HashMap<String, String>();
     L.put("India","Usa");
     L.put("London","UK");
     L.put("Germany","France");
     System.out.println(L);
     L.remove("UK","France");
     System.out.println(L);
    }
}
