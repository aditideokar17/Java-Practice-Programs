// Write a Java program to swap two variables.

class Pb14{
    public static void main(String args[]){
        int num1  = 12;
        int num2 = 15;

        int temp = 0;

        System.out.println("Before Swapping : " + num1 + " & " + num2);
        
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After Swapping : " + num1 + " & " + num2);
    }
}