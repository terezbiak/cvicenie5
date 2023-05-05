import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Priklad5_8 {
    public static void main(String args[]){
        List slova = new ArrayList<>();
        String slovo = "test";

        slova.add("test");
        slova.add("dom");
        slova.add("strom");
        slova.add("test");

        Iterator iterator = slova.iterator();
        while (iterator.hasNext()) {
            String s = (String)iterator.next();
            if(s.equals(slovo)) {
                iterator.remove();
            }
        }
        System.out.println(slova);
    }
}
