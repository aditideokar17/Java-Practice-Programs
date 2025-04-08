// Write a Java program to print the results of the following operations.
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3
// Expected Output :
// 43
// 1
// 19
// 13

class Pb4{
    public static void main(String args[]){
        int exp1 = (-5+8*6);
        int exp2 = (55+9) % 9;
        int exp3 = 20 + (-3) * 5 / 8;
        int exp4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);
        System.out.println(exp4);
    }
}