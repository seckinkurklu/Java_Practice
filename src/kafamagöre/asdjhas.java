package kafamagöre;

import java.util.Scanner;

public class asdjhas {

    public static void main(String[] args) {


        System.out.println("İsminiz?");

        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();

        System.out.println("Yaşınız?");
        String yaş = input.nextLine();

        System.out.println("Merhaba " + yaş + " yaşındaki " + isim + ". Hoş geldin!");


        int a;
        int b;


        System.out.println("1. sayıyı girin");
        int sayı1 = input.nextInt();

        System.out.println("2. sayıyı girin");
        int sayı2 = input.nextInt();


        int toplam = sayı1 + sayı2;


        System.out.println("1. ve 2. sayının toplamı " + toplam);



    }


}
