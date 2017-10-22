import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Winners> ar = new ArrayList<Winners>();
        ar.add(new Winners(341, "Elena"));
        ar.add(new Winners(273, "Thomas"));
        ar.add(new Winners(278, "Hamilton"));
        ar.add(new Winners(329, "Suzie"));
        ar.add(new Winners(445, "Phil"));
        ar.add(new Winners(402, "Matt"));
        ar.add(new Winners(388, "Alex"));
        ar.add(new Winners(275, "Emma"));
        ar.add(new Winners(243, "John"));
        ar.add(new Winners(334, "James"));
        ar.add(new Winners(412, "Jane"));
        ar.add(new Winners(393, "Emily"));
        ar.add(new Winners(299, "Daniel"));
        ar.add(new Winners(343, "Neda"));
        ar.add(new Winners(317, "Aaron"));
        ar.add(new Winners(265, "Kate"));

        Collections.sort(ar, new SortTime());

        System.out.println("\nSorted by time");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


    }
}

