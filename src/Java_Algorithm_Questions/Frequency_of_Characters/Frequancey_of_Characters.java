package Java_Algorithm_Questions.Frequency_of_Characters;

import java.util.Scanner;

public class Frequancey_of_Characters {


    public static void main(String[] args) {
        System.out.println("Please put on an input: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();

        if (str1 == null) {

            System.out.println("Input is null");

            return;
        }


        if (str1.isEmpty()) {

            System.out.println("Input is empty");

            return;

        }

        for (int i = 0; i < str1.length(); i++) {

            char currentcharacter = str1.charAt(i);
            int count = 0;


            if (str1.indexOf(currentcharacter) < i) {
                continue;
            }


            for (int j = 0; j < str1.length(); j++) {


                if (str1.charAt(j) == currentcharacter) {

                    count++;
                }

            }

            System.out.println(currentcharacter + ": " + count);

        }


    }

}
