package day13_customMethods;


import java.util.Scanner;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

       /* Scanner num = new Scanner(System.in);

        System.out.println("Enter a number:");
        if (isOdd(num.nextInt()) ){

            System.out.println(num + " is a odd number");

        }else{
            System.out.println(num + " is an even number");
        }
        */


        System.out.println(isOdd(5));

    }


    public static boolean isOdd(int num) {
        // return (num % 2 != 0)? true : false;
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


}
