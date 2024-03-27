package kafamagöre;

import java.util.ArrayList;

public class deneme {


    public static void main(String[] args) {

        String firstName = "DANIEL";
        int birthYear = 1985;

        String pattern = firstName + "_" + birthYear; // every pattern account MUST have firstname, underscore and birth year

        String gmail = pattern + "@gmail.com";
        String yahoo = pattern + "@yahoo.com";
        String outlook = pattern + "@outlook.com";
        String hotmail = pattern + "@hotmail";

        /*
        System.out.println("Your generated emails are:");
        System.out.println("\tYahoo: " + yahoo);
        System.out.println("\tGmail: " + gmail);
        System.out.println("\tOutlook: " + outlook);
        System.out.println("\tHotmail: " + hotmail);
         */

        yahoo = yahoo.toLowerCase();
        gmail = gmail.toLowerCase();
        outlook = outlook.toLowerCase();
        hotmail = hotmail.toLowerCase();


        System.out.println("Your generated emails are:\n\tYahoo: " + yahoo + "\n\tGmail: " + gmail
                + "\n\tOutlook: " + outlook + "\n\tHotmail: " + hotmail);


        ArrayList<Integer> a = new ArrayList<>();


    }


}
