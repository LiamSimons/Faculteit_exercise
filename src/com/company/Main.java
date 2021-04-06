package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long number = input();
        long answer = factorial(number);
        System.out.println("De faculteit van "+ number + " is : " + answer);
    }



    private static long factorial(long x){
        if(x>1){
            x *= factorial(x-1);
            System.out.println("Tussenstap : "+ x);
        }
        return x;
    }


    private static long input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Voer een getal in kleiner of gelijk aan 12 : ");
        long number = input.nextInt();
        return number;
    }
}
