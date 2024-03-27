package day12_customMethods;

import java.util.Scanner;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Tek mi yoksa çift mi olduğunu bilmek istediğiniz sayıyı giriniz:");

        oddOrEven(input.nextInt());


    }

    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }



    // create a method that can check if a person is eligible to buy alcohol  (age)


    // create a method that can check if a number is odd, or even or zero (number)


    // create a method that can calculate the grade of the students  (score)


    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)


    //Create a method that can display the initials of a person  (firstName, lastName)

        /*
        firstname = "Cydeo"
        lastname = "School"


        initial ==> C.S
         */




}