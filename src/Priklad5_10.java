import java.util.HashSet;
import java.util.Set;

public class Priklad5_10 {
    public static void main(String args[]) {
        Set set1 = new HashSet();
        Set set2 = new HashSet();

        set1.add("januar");
        set1.add("februar");
        set1.add("marec");

        set2.add("januar");
        set2.add("februar");
        set2.add("april");
        set2.add("maj");

        Set zjednotenie = new HashSet(set1);
        zjednotenie.addAll(set2);
        System.out.println(zjednotenie);

        Set prienik = new HashSet(set1);
        prienik.retainAll(set2);
        System.out.println(prienik);

        Set doplnok = new HashSet(zjednotenie);
        doplnok.retainAll(set1);
        System.out.println(doplnok);
    }
}
