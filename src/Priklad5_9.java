import java.util.*;

public class Priklad5_9 {
    public static void main(String args[]){
        List slova = new LinkedList();

        slova.add("test");
        slova.add("strom");
        slova.add("dom");
        slova.add("strom");
        slova.add("strom");
        slova.add("strom");
        slova.add("test");

        Set prejdeme = new HashSet();
        Iterator iterator = slova.iterator();
        while (iterator.hasNext()) {
            String s = (String)iterator.next();
            if (prejdeme.contains(s)){
                iterator.remove();
            } else {
                prejdeme.add(s);
            }
        }
        System.out.println(slova);
    }
}
