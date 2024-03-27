package kafamagöre;

import java.sql.SQLOutput;
import java.util.Scanner;

public class alkolAlma {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Ülke gir (TR/US)");

        String ülke = input.nextLine().toUpperCase();


        System.out.println("Yaş gir");

        int yaş = input.nextInt();

        if (ülke.equals("US")) {

            if (yaş >= 21) {
                System.out.println("Alkol alabilirsin");
            } else {
                System.out.println("Alkol alamazsın");
            }
        }

        if (ülke.equals("TR")) {

            if (yaş >= 18){
                System.out.println("Alkol alabilirsin");
            }else {
                System.out.println("Alkol alamazsın");

            }
        }

    }
}


/*             SWITCH KULLANILMIŞ HALİ

import java.util.Scanner;

public class AlkolAlma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ülke gir (TR/US)");

        String ülke = input.nextLine().toUpperCase();

        System.out.println("Yaş gir");

        int yaş = input.nextInt();

        if (ülke.equals("US")) {

            if (yaş >= 21) {
                System.out.println("Alkol alabilirsin");
            } else {
                System.out.println("Alkol alamazsın");
            }

        } else if (ülke.equals("TR")) {

            if (yaş >= 18) {
                System.out.println("Alkol alabilirsin");
            } else {
                System.out.println("Alkol alamazsın");
            }

        } else {
            System.out.println("Geçersiz ülke girişi");
        }

        input.close();
    }
}
 */