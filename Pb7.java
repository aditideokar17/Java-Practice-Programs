// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

class Pb7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + " = " + num * i);
        }
    }
}