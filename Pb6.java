// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

class Pb6{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input frist number:");
        int num1 = sc.nextInt();
        
        System.out.println("Input second number:");
        int num2 = sc.nextInt();

        System.out.println("Addition is:" + (num1+num2));
        System.out.println("Subtraction is:"+ (num1-num2));
        System.out.println("Multiplication is:"+ (num1*num2));
        System.out.println("Division is:"+ (num1/num2));
        System.out.println("Mod is:"+ (num1%num2));

    }
}