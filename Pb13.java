// Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

class Pb13{

    public static void main(String args[]){
        double length = 8.5;
        double width = 5.6;
        double area  = length * width;
        double perimeter = (length + width) * 2;
        System.out.println("The area of rectangle : " + area);
        System.out.println("The perimeter of rectangle : " + perimeter);
    }
}