package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("JavA", "JAvA", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);


        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("Java")) {
                names.set(i, "Python");
            }
        }
        System.out.println(names);

        /*
        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);
         */


        System.out.println("----------------------------------------");


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");

        System.out.println(countJava);



    }
}
